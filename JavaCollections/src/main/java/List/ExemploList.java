package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {

        List <String> nomes = new ArrayList<>();
        nomes.add("Silvio Dias");
        nomes.add("Jociane Dias");
        nomes.add("Roberto Figueira");
        nomes.add("Ana Mara");
        nomes.add("Brenda");

        nomes.set(2, "Antônio Carlos");
        System.out.println(nomes);

        nomes.remove(3);

        Collections.sort(nomes);
        System.out.println(nomes);

        nomes.remove("Brenda");
        System.out.println(nomes);

        String nome = nomes.get(1);
        System.out.println(nome);

        int tamanho = nomes.size();
        System.out.println("Tamanho da Lista: "+tamanho);

        nomes.add("Vinicius Eduardo");
        tamanho = nomes.size();
        System.out.println("Tamanho da Lista: "+tamanho);

        Boolean temRodrigo = nomes.contains("Rodrigo");
        System.out.println("Tem o nome Rodrigo:" +temRodrigo);

        //nomes.clear(); //limpar a lista

        Boolean listaVazia = nomes.isEmpty();
        System.out.println(listaVazia);

        int nomeSilvio = nomes.indexOf("Silvio Dias");
        System.out.println(nomeSilvio);

        for(String listarNomes: nomes){
            System.out.println(listarNomes);
        }

        System.out.println("*************** Próxima linha ***************");
        Iterator <String> nomesDaLista = nomes.iterator();
        while (nomesDaLista.hasNext()){
            System.out.println(nomesDaLista.next());
        }

    }
}
