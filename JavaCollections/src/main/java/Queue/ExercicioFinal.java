package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ExercicioFinal {
    public static void main(String[] args) {


        Queue <String> filaMercado = new LinkedList<>();

        //Adcione 5 nomes
        filaMercado.add("Juliana");
        filaMercado.add("Pedro");
        filaMercado.add("Carlos");
        filaMercado.add("Larissa");
        filaMercado.add("João");

        //Navegue na fila exibindo cada nome no console
        for(String nome: filaMercado){
            System.out.println(nome);
        }

        //Retorne o primeiro item da fila, sem removê-lo
        System.out.println("Primeiro da fila: "+filaMercado.peek());
        System.out.println(filaMercado);

        //Retorne o primeiro item da fila, removendo o mesmo.
        String removendoPrimeiroDaFila = filaMercado.remove();
        System.out.println("Elemento removido: "+removendoPrimeiroDaFila);
        System.out.println(filaMercado);

        //Adicione um novo nome: Daniel. Verifique a posição que o mesmo assumiu na fila.
        filaMercado.add("Daniel");
        System.out.println(filaMercado);

        //Retorne o tamanho da fila
        System.out.println("A fila tem "+filaMercado.size()+" elemento(s).");

        //Verifique se a lista está vazia
        System.out.println("A fila está vazia? "+filaMercado.isEmpty());

        //Verifique se o nome Carlos está na lista
        Boolean temNomeCarlos = filaMercado.contains("Carlos");
        System.out.println("Tem o nome Carlos? "+temNomeCarlos);

    }
}
