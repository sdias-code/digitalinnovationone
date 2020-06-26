package modulo6b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class ClientHttpExemplo {
    public static void main(String[] args) throws IOException {

        conectAndPrintOracleJava();
    }

    private static void conectAndPrintOracleJava() throws IOException {
        var url = new URL("https://docs.oracle.com/javase/10/language/");
        var urlConnection = url.openConnection();

        try(var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
            System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">",">\n"));
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
}
