package modulo6c;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ClientHttpExemplo3 {

    static ExecutorService executor = Executors.newFixedThreadPool(6, new ThreadFactory(){

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            System.out.println("Nova Thread criada "+ (thread.isDaemon() ? "daemon": "") +
                    "Thread Group"+ thread.getThreadGroup());
            return thread;
        }
    });
    public static void main(String[] args) throws IOException, InterruptedException {

        //conectAndPrintOracleJava();
        conexaoServidorAkamaiHttpClient();

    }

    private static void conexaoServidorAkamaiHttpClient(){
        System.out.println("Running HTTP/2 example ...");
        try{
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_2)
                    .proxy(ProxySelector.getDefault())
                    .build();

            Long start = System.currentTimeMillis();

            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create("https://http2.akamai.com/demo/h2_demo_frame.html"))
                    .build();

            HttpResponse<String> response = httpClient.send(mainRequest,HttpResponse.BodyHandlers.ofString());

            System.out.println("Status code :: "+response.statusCode());
            System.out.println("Headers response :: "+response.headers());
            String responseBody = response.body();
            System.out.println(responseBody);

            List<Future<?>> future = new ArrayList<>();
            responseBody
                    .lines()
                    .filter(line-> line.trim().startsWith("<img height"))
                    .map(line-> line.substring(line.indexOf("src='")+5,line.indexOf("'/>")))
                    .forEach(image->{
                        Future<?> imgFuture = executor.submit(()-> {
                            HttpRequest imgRequest = HttpRequest.newBuilder()
                                    .uri(URI.create("https://http2.akamai.com"+image))
                                    .build();

                            try {
                                HttpResponse<String> imageResponse = httpClient.send(imgRequest, HttpResponse.BodyHandlers.ofString());
                                System.out.println("Imagem carregada: "+ image+ ", status code: "+ imageResponse.statusCode());
                            } catch (IOException ioException) {
                                ioException.printStackTrace();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        });
                        future.add(imgFuture);
                        System.out.println("Submit images: "+image);
                    });
                    //.forEach(image-> System.out.println(image));

            future.forEach(f->{
                try{
                    f.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            });
            Long end = System.currentTimeMillis();
            System.out.println("Tempo de carregamento total: "+(end - start)+" ms");

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }finally {
            executor.shutdown();
        }
    }

    private static void conectAndPrintOracleJava() throws IOException, InterruptedException {
        HttpRequest request = (HttpRequest) HttpRequest.newBuilder()
                .GET().uri(URI.create("https://docs.oracle.com/javase/10/language/"))
                .build();
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response = httpClient.send(request,HttpResponse.BodyHandlers.ofString());

        System.out.println("Status code :: "+response.statusCode());
        System.out.println("Headers response :: "+response.headers());
        System.out.println(response.body());
    }
}
