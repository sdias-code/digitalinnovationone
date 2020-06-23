package modulo2;

import java.util.function.Supplier;

public class Exemplo05Supplier {
    public static void main(String[] args) {
        //Supplier<Pessoa> suppliers = () -> new Pessoa();
        Supplier<Pessoa> suppliers = Pessoa::new;
        System.out.println(suppliers.get());


    }
}


