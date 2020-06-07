package Optional;

import org.w3c.dom.ls.LSOutput;

import java.util.Optional;

public class Exerciciofinal001 {
    public static void main(String[] args) {

        //Crie um estado vazio
        Optional<String> optionalVazio = Optional.empty();
        optionalVazio.ifPresentOrElse(System.out::println,
                ()-> System.out.println("Situação: Optional vazio"));

        //Crie um estado presente
        Optional<String> optionalPresente = Optional.of("Situação: Presente");
        optionalPresente.ifPresentOrElse(System.out::println,
                () -> System.out.println("Situação vazio"));

        //Crie um estado null
        Optional<String> optionalNull = Optional.ofNullable(null);
        optionalNull.ifPresentOrElse(System.out::println,
                ()-> System.out.println("Situação: Null"));

        //Se presente, pegue o valor do optional e atribua em uma variável
        if(optionalPresente.isPresent()){
            String valor = optionalPresente.get();
            System.out.println("Valor armazenado na variável: "+valor);
        }
        //Se presente, filtre o optional com uma determinada regra de negócio
        optionalPresente.map((valor)->valor.concat("----")).ifPresent(System.out::println);
    }
}
