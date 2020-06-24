package modulo3c;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class FutureExemplo {
    private static final ExecutorService pessoaParaExecutarAtividade = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        Casa casa = new Casa(new Quarto());
        List<Future<String>> futuros =
                new CopyOnWriteArrayList<>(casa.obterAfazeresDaCasa().stream()
                .map(atividade -> pessoaParaExecutarAtividade.submit(()->{
                    try{
                        return atividade.realizar();
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    return null;
                }))
                        .collect(Collectors.toList()));

        while(true){
            int numeroDeAtividadesNaoFinalizadas = 0;
            for(Future<?> futuro: futuros){
                if(futuro.isDone()){
                    try{
                        System.out.println("Parabéns você terminou de "+futuro.get());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
                else {
                    numeroDeAtividadesNaoFinalizadas++;
                }
            }
            if(futuros.stream().allMatch(Future::isDone)){
                break;
            }
            System.out.println("Número de atividades não realizadas: "+ numeroDeAtividadesNaoFinalizadas);
            Thread.sleep(500);
        }
        pessoaParaExecutarAtividade.shutdown();

    }
}
