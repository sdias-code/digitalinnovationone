package modulo1;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class Exemplo3BiPredicate {

    //Composição de funçoes
    public static void main(String[] args) {
        BiPredicate<Integer, Integer> verificaSeEMaior =
                (parametro, valorComparacao)-> parametro > valorComparacao;
        System.out.println(verificaSeEMaior.test(13,12));
        System.out.println(verificaSeEMaior.test(12,13));
    }
}
