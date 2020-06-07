package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ExercicioFinal001 {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Rodrigo", 25));
        funcionarios.add(new Funcionario("Antonio", 38));
        funcionarios.add(new Funcionario("Fabiana", 27));
        funcionarios.add(new Funcionario("Suelem", 20));

        //Exibindo Lista de funcionarios
        System.out.println("--- Ordem de Inserção ---");
        System.out.println(funcionarios.toString());

        //Ordenar por nome (Comparator)
        System.out.println("---- Lista ordenada por idade usando Comparator ---");
        Collections.sort(funcionarios, Funcionario::compareTo);
        System.out.println(funcionarios);

        //Ordenar por idade (Comparable)
        System.out.println("--- Lista ordenada por idade usando Comparable ---");
        //Collections.sort(funcionarios, new OrdenarPorIdade());
        Collections.sort(funcionarios);
        System.out.println(funcionarios);

        //Usando expressão Lambda
        System.out.println("--- Lista ordenada por idade usando expressão Lambda ---");
        funcionarios.sort((first, second)->first.getIdade() - second.getIdade());
        System.out.println(funcionarios);

        //Usando referencia de métodos e métodos estáticos
        System.out.println("--- Ordenando usando referencia de métodos e métodos estáticos ---");
        Collections.sort(funcionarios, new OrdenarPorNome());
        System.out.println(funcionarios);

    }


}
