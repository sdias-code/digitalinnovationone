package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExercicioFinal {
    public static void main(String[] args) {

        List <String> nomes = new ArrayList<>();
        nomes.add("Juliana");
        nomes.add("Pedro");
        nomes.add("Carlos");
        nomes.add("Larissa");
        nomes.add("João");

        //navegando nos nomes da lista
        for(String listaNomes: nomes){
            System.out.println("--> "+listaNomes);
        }
        nomes.set(2,"Roberto");
        System.out.println(nomes.get(1));

        nomes.remove(4);
        nomes.remove("João");

        System.out.println("Tamanho da Lista: "+nomes.size());
        Boolean existeJuliano = nomes.contains("Juliano");
        System.out.println("Encontrou Juliano? "+existeJuliano);

        List <String> novaLista = new ArrayList<>();
        novaLista.add("Ismael");
        novaLista.add("Rodrigo");

        nomes.add(novaLista.get(0));
        nomes.add(novaLista.get(1));
        Collections.sort(nomes);

        for(String imprimirLista: nomes){
            System.out.println("---> "+imprimirLista);
        }

        Boolean listaEstaVazia =  nomes.isEmpty();
        System.out.println("A lista está vazia? "+listaEstaVazia);
    }
}
