package modulo2;

import java.util.ArrayList;
import java.util.List;


public class Exemplo08List {
    public static void main(String[] args) {
        List<String> profissoes = new ArrayList<>();
        profissoes.add("Engenheiro");
        profissoes.add("Arquiteto");
        profissoes.add("Advogado");
        profissoes.add("Agricultor");
        profissoes.add("Jornalista");

        //listarProfissoes(profissoes);

        filtrarProfissoes(profissoes);

        System.out.println("\nProfissoes filtro: Agricultor");
        profissoes.stream().filter(profissao-> profissao.startsWith("Agricultor")).forEach(System.out::println);
    }

    public static void listarProfissoes(List profissoes){
        System.out.println("Listando todas as Profissões:");
        profissoes.stream().forEach(System.out::println);
    }

    public static void filtrarProfissoes(List profissoes){
        System.out.println("\nExibindo Profissão filtrada:");
        profissoes.stream().filter(profissao->profissao.equals("Jornalista"))
                .forEach(System.out::println);

    }

}
