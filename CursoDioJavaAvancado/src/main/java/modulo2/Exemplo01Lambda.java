package modulo2;

public class Exemplo01Lambda {

    public static void main(String[] args) {

        CalculoValor somar = (a, b) -> a + b;
        CalculoValor subtrair = (a, b)-> a - b;
        CalculoValor dividir = (a, b)-> a / b;
        CalculoValor multiplicar = (a, b)-> a * b;

        System.out.println(realizarCalculo(somar,10,15));
        System.out.println(realizarCalculo(subtrair, 10,3));
        System.out.println(realizarCalculo(dividir, 12,4));
        System.out.println(realizarCalculo(multiplicar,5,2));

    }

    public static int realizarCalculo( CalculoValor calcular, int a, int b){
        return calcular.calcularValor(a, b);
    }

}
