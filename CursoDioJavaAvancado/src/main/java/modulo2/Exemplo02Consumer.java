package modulo2;

import java.util.function.Consumer;

public class Exemplo02Consumer {
    public static void main(String[] args) {

        Consumer<String> imprimirFrase = frase-> System.out.println(frase);
        imprimirFrase.accept("Hello World!");

        Consumer<String> imprimirOutraFrase = System.out::println;
        imprimirOutraFrase.accept("Chegamos no topo!");
    }
}
