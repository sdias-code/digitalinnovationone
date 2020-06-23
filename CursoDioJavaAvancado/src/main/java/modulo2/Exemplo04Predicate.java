package modulo2;

import java.util.function.Predicate;

public class Exemplo04Predicate {
    public static void main(String[] args) {
        //Predicate retorna um valor booleano
        //Predicate<String> estaVazio = valor -> valor.isEmpty();
        Predicate<String> estaVazio = String::isEmpty;
        System.out.println(estaVazio.test("Olá"));
        System.out.println(estaVazio.test(""));

    }
}
