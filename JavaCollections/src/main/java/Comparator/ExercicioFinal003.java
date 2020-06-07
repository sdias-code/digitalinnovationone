package Comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class ExercicioFinal003 {

    public static void main(String[] args) {

        TreeMap<Pizza, String> pizzas = new TreeMap<Pizza, String>(new OrdenarTreeMap());

        pizzas.put(new Pizza("Peperone", 20), "PEPERONE");
        pizzas.put(new Pizza("Calabresa", 25), "CALABRESA");
        pizzas.put(new Pizza("Portuguesa", 50), "PORTUGUESA");
        pizzas.put(new Pizza("Frango Catupiry", 35), "FRANGO");
        pizzas.put(new Pizza("Sardinha", 40), "SARDINHA");
        pizzas.put(new Pizza("Chocolate", 25), "COCOLATE");

        //System.out.println(pizzas);

        //Exibindo Lista ordenada pelo preço
        Set<Pizza> sabores = pizzas.keySet();
        for (Pizza sabor: sabores){
            System.out.println(sabor+ " - "+pizzas.get(sabor));
        }


    }

}
