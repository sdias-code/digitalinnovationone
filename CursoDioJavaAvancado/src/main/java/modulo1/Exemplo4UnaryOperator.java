package modulo1;

import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class Exemplo4UnaryOperator {

    //Composição de funçoes
    public static void main(String[] args) {
        UnaryOperator<Integer> retornaDobro = v-> v*2;
        int valor = 20;
        System.out.println(retornaDobro.apply(valor));
        System.out.println(valor);
    }
}
