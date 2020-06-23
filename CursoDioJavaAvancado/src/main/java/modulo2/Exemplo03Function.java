package modulo2;

import java.util.function.Function;

public class Exemplo03Function {
    public static void main(String[] args) {
        //Function<String, String> retornaTextoInverso = texto -> new StringBuilder(texto).reverse().toString();
        //System.out.println(retornaTextoInverso.apply("Silvio Dias"));

        //Function<String, Integer> converteTextoEmInteiros = valorTexto -> Integer.valueOf(valorTexto) * 2;
        Function<String, Integer> converteTextoEmInteiros = Integer::valueOf;
        System.out.println(converteTextoEmInteiros.apply("10"));
    }
}
