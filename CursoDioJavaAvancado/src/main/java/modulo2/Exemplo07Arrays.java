package modulo2;

import java.util.stream.Stream;

public class Exemplo07Arrays {
    public static void main(String[] args) {
        Integer[] numeros = {58, 49, 56, 78, 92, 34};
        imprimirNumeroDobro(numeros);
        imprimirNumeroDobroStream(numeros);

    }

    public static void imprimirNumeroDobro(Integer... numeros){
        System.out.println("Imprimindo pelo for:");
        for(Integer num: numeros){
            System.out.println(num * 2);
        }
    }

    public static void imprimirNumeroDobroStream(Integer... numeros){
        System.out.println("Imprimindo por Stream:");
        Stream.of(numeros).map(numero -> numero *2)
                .forEach(System.out::println);
    }
}
