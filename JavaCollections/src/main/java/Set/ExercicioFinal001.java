package Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExercicioFinal001 {
    public static void main(String[] args) {
        //Uso do HashSet
        Set<Integer> numInteiros = new HashSet<>();

        //Adicione 5 numeros inteiros
        numInteiros.add(3);
        numInteiros.add(88);
        numInteiros.add(20);
        numInteiros.add(44);
        numInteiros.add(3);//HasSet não permite repetir valores

        //Navege no Set exibindo cada número no console
        Iterator<Integer> numeros = numInteiros.iterator();
        while (numeros.hasNext()){
            System.out.println("--> "+numeros.next());
        }

        //Remova o primeiro item do Set
        numInteiros.remove(3);

        //Adicione um novo número no Set: 23
        numInteiros.add(23);

        //Verifique o tamanho do Set
        System.out.println("Número de Elementos: "+numInteiros.size());

        //Verifique se o Set está vazio
        System.out.println("Set está vazio? "+numInteiros.isEmpty());

        //Exibindo Valores
        System.out.println(numInteiros);
    }
}
