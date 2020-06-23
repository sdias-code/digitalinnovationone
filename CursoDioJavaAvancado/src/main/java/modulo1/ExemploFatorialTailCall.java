package modulo1;

public class ExemploFatorialTailCall {
    public static void main(String[] args) {
        System.out.println(fatorialA(5));
    }

    public static double fatorialA(double valor){
        return fatorialComTailCall(valor,1);
    }
    public static double fatorialComTailCall(double valor, double numero){
        if(valor == 0){
            return numero;
        }
        return fatorialComTailCall(valor-1, numero * valor);
    }
}
