package Comparator;

import java.util.Comparator;

public class OrdenarTreeSet implements Comparator<Empregado> {

    @Override
    public int compare(Empregado o1, Empregado o2) {
        return o1.getIdade().compareTo(o2.getIdade());
    }

}
