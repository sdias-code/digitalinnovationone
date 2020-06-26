package modulo5a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class InferenciaExemplo2 {
    public static void main(String[] args) throws IOException {

        //conectAndPrintOracleJava();
        printarNomeCompleto("Silvio", "Dias Ferreira");
        printarSoma(10,4,10,5);
    }

    private static void conectAndPrintOracleJava() throws IOException {
        var url = new URL("https://docs.oracle.com/javase/10/language/");
        var urlConnection = url.openConnection();
        var bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        System.out.println(bufferedReader.lines().collect(Collectors.joining()).replaceAll(">",">\n"));
    }

    //obs. var não pode ser utilizado em nível de classe
    //obs. var não pode ser utilizado como parâmetro
    //obs. var não pode ser utilizado em variavel não inicializada
    public static void printarNomeCompleto(String nome, String sobrenome){
        var nomeCompleto = String.format("%s %s",nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static void printarSoma(int... numeros){
        int soma;
        if(numeros.length > 0){
            soma = 0;
            for(int numero: numeros){
                soma += numero;
            }
            System.out.println("A soma é: "+soma);
        }
    }

}
