package Queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Exemplo001 {
    public static void main(String[] args) {

        Queue <String> filaDeBanco = new LinkedList<>();
        filaDeBanco.add("Camila");
        filaDeBanco.add("Rogério");
        filaDeBanco.add("Patrícia");
        filaDeBanco.add("Mateus");
        filaDeBanco.add("Paulo");

        System.out.println(filaDeBanco);

        //metodo poll() exibe e remove elemento da fila
        String clienteASerAtendido = filaDeBanco.poll();
        System.out.println(clienteASerAtendido);

        System.out.println(filaDeBanco);
        //limpando a fila
        //filaDeBanco.clear();

        //metodo peek() exibe primeiro elemento da fila - só consulta
        String consultaPrimeiroDaFila = filaDeBanco.peek();
        System.out.println(consultaPrimeiroDaFila);
        System.out.println(filaDeBanco);

        //limpando a fila
        //filaDeBanco.clear();

        //metodo element() exibe primeiro elemento da fila - gera uma exception caso a fila esteja vazia
        String primeiroClientOuErro = filaDeBanco.element();
        System.out.println(primeiroClientOuErro);
        System.out.println(filaDeBanco);

        for(String client: filaDeBanco){
            System.out.println("--> "+client);
        }

        Iterator <String> iteratorFilaDeBanco = filaDeBanco.iterator();
        while (iteratorFilaDeBanco.hasNext()){
            System.out.println(">>>> "+iteratorFilaDeBanco.next());
        }

        System.out.println("Elementos na fila: "+filaDeBanco.size());
        System.out.println("Fila está vazia? "+filaDeBanco.isEmpty());

    }
}
