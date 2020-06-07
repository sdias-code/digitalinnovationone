package Comparator;

import java.util.Comparator;

public class OrdenarPorNome implements Comparator<Funcionario> {

    public int compare(Funcionario p1, Funcionario p2){

        return p1.getNome().compareTo(p2.getNome());
    }

}
