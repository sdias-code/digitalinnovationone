package digital.innovation.one.core;

import digital.innovation.one.utils.Calculadora;

public class Runner {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        System.out.println(calc.div(10,2));
        System.out.println(calc.sum(20,5));
    }
}
