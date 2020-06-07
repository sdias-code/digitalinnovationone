package Comparator;

import java.util.TreeSet;

public class ExercicioFinal002 {
    public static void main(String[] args) {

        TreeSet<Empregado> empregados = new TreeSet<Empregado>(new OrdenarTreeSet());

        empregados.add(new Empregado("Rogério", 31));
        empregados.add(new Empregado("Carlos", 20));
        empregados.add(new Empregado("Patrícia", 35));
        empregados.add(new Empregado("Samuel", 22));

        System.out.println(empregados);





    }
}
