package Set;

import java.util.Iterator;
import java.util.TreeSet;

public class ExercicioFinal003 {
    public static void main(String[] args) {
        //Uso do TreeSet
        TreeSet<Integer> numInteiros = new TreeSet<>();

        //Adicione 5 numeros inteiros
        numInteiros.add(3);
        numInteiros.add(88);
        numInteiros.add(20);
        numInteiros.add(44);
        numInteiros.add(3);

        //Navegue no Set exibindo cada número no console
        Iterator<Integer> numeros = numInteiros.iterator();
        while (numeros.hasNext()){
            System.out.println("--> "+numeros.next());
        }

        //Remova o primeiro item do Set
        numInteiros.pollFirst();

        //Adicione um novo número no Set: 23
        numInteiros.add(23);

        //Verifique o tamanho do Set
        System.out.println("Número de Elementos: "+numInteiros.size());

        //verifique se o Set está vazio - Uso de condição ternária
        System.out.println("O Set está vazio? "+(numInteiros.isEmpty()?"Sim.":"Não."));

        //Exibindo Elementos
        System.out.println(numInteiros);
    }
}
