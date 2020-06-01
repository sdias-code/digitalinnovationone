package List;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {

        List <String> esportes = new Vector<>();
        esportes.add("Futebol");
        esportes.add("Volei");
        esportes.add("Basquete");
        esportes.add("Natação");
        esportes.add("Basebol");

        esportes.set(2, "Handbol");
        esportes.remove("Basquete");
        esportes.remove(0);
        System.out.println(esportes.get(0));

        for(String listaEsporte: esportes){
            System.out.println("--> "+listaEsporte);
        }

    }
}
