package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExercicioFinal001 {
    public static void main(String[] args) {

        //Cria a coleção de estudantes
        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Simone", 25));
        estudantes.add(new Estudante("Aline", 17));
        estudantes.add(new Estudante("Joana", 18));
        estudantes.add(new Estudante("Ana", 40));
        estudantes.add(new Estudante("Fábio",60));
        estudantes.add(new Estudante("José", 15));
        estudantes.add(new Estudante("Bárbara", 35));
        estudantes.add(new Estudante("Daniel", 20));

        //Transforme cada estudante em uma string com os atributos do objeto
        System.out.println(estudantes.stream().map((estudante)->
                estudante.getNome().concat(" - ").concat(String.valueOf(estudante.getNome().length())))
                .collect(Collectors.toList()));

        //Conte a quantidade de estudantes que tem na coleção
        System.out.println("Elementos na coleção: "+
                estudantes.stream().count());

        //Filtre estudantes com idade igual ou superior a 18 anos
        System.out.println("idade igual ou superior 18 anos: "+
                estudantes.stream().filter((estudante)-> estudante.getIdade() >= 18)
                        .collect(Collectors.toList()));

        //Exiba cada elemento no console
        System.out.println("Elemento no console: "+
                estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //Retorne estudantes que possui a letra B
        System.out.println("Estudantes com letra (B): "+
                estudantes.stream().filter((estudante)->
                        estudante.getNome().contains("B"))
                        .collect(Collectors.toList()));

        //Retorne se existe ao menos um estudante com a letra D no nome
        System.out.println("Tem estudante com a letra D? "
                +estudantes.stream().anyMatch((estudante)->
                estudante.getNome().contains("D")));

        //Retorne o estudante mais velho (maior idade) da coleção
        System.out.println("Estudante mais velho: "+
                estudantes.stream().max(Comparator.comparingInt((estudante)->
                        estudante.getIdade())));

        //Retorne o estudante mais novo (menor idade) da coleção
        System.out.println("Estudante mais velho: "+
                estudantes.stream().min(Comparator.comparingInt((estudante)->
                        estudante.getIdade())));
    }
}
