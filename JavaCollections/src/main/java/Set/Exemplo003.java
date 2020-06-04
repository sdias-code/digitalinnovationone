package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class Exemplo003 {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");
        treeCapitais.add("Manaus");

        System.out.println(treeCapitais);

        //retorna a primeira capital no topo da árvore
        System.out.println("Primeiro Elemento: "+treeCapitais.first());

        //Retorna último elemento da árvore
        System.out.println("Último elemento: "+treeCapitais.last());

        //retorna a primeira capital antes na árvore da capital parametrizada
        System.out.println("Antes de Florianópolis: "+treeCapitais.lower("Florianópolis"));
        System.out.println(treeCapitais);

        //retorna a primeira capital depois na árvore da capital parametrizada
        System.out.println("Depois de Florianópolis: "+treeCapitais.higher("Florianópolis"));
        System.out.println(treeCapitais);

        //Retorna a primeira capital no top da árvore, removendo do set
        System.out.println(treeCapitais.pollFirst());

        //Retorna  a primeira capital no final da árvore, removendo do set
        System.out.println(treeCapitais.pollLast());

        //Exibe todas as capitais no console
        System.out.println(treeCapitais);

        //Navega em todos os itens do iterator
        Iterator<String> capIterator = treeCapitais.iterator();
        while(capIterator.hasNext()){
            System.out.println("--> "+capIterator.next());
        }

        for(String capitais: treeCapitais){
            System.out.println("==> "+capitais);
        }

    }
}
