package Set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Exemplo002 {

    public static void main(String[] args) {

        LinkedHashSet<Integer>  seqNum = new LinkedHashSet<>();

        //adiciona os numeros no set
        seqNum.add(1);
        seqNum.add(2);
        seqNum.add(4);
        seqNum.add(8);
        seqNum.add(16);

        System.out.println(seqNum);

        //remove o numero do set
        seqNum.remove(4);

        System.out.println(seqNum);

        //retorna a quantidade do item do set
        System.out.println("Número de elementos no set: "+seqNum.size());

        //navega em todos os itens do iterator

        Iterator<Integer> numInterator = seqNum.iterator();
        while (numInterator.hasNext()){
            System.out.println("--> "+numInterator.next());
        }

        for(Integer numero: seqNum){
            System.out.println("==> "+numero);
        }

        //retorna se o set está vazio
        System.out.println("Está vazio: "+seqNum.isEmpty());
    }

}
