package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExercicioFinal002 {
    public static void main(String[] args) {
        //Uso do LinkedHashSet
        LinkedHashSet<Integer> numInteiros = new LinkedHashSet<>();

        //Adicione 5 numeros inteiros
        numInteiros.add(3);
        numInteiros.add(88);
        numInteiros.add(20);
        numInteiros.add(44);
        numInteiros.add(3); //Não é permitido inserir conteúdo repetido

        //Navegue no Set Exibindo cada número no console
        Iterator<Integer> numeros = numInteiros.iterator();
        while (numeros.hasNext()){
            System.out.println("--> "+numeros.next());
        }

        //Remova o primeiro item do Set
        numInteiros.remove(3);

        //Adicione um novo número no Set: 23
        numInteiros.add(23);

        //Verifique o tamanho do Set
        System.out.println("Número de Elementos: "+ numInteiros.size());

        //Exibir elementos
        System.out.println(numInteiros);

        //Verifique se o Set está vazio - Uso de condição ternária
        System.out.println("Set está vazio? "+ (numInteiros.isEmpty()?"Sim": "Não"));

    }
}
