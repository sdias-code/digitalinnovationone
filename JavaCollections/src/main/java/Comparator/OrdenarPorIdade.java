package Comparator;

import java.util.Comparator;

public class OrdenarPorIdade implements Comparator<Funcionario> {

    @Override
    public int compare(Funcionario p1, Funcionario p2) {

        return p1.getIdade() - p2.getIdade();
    }
}
