package Comparator;

import java.util.Comparator;

public class OrdenarTreeMap implements Comparator<Pizza> {


    @Override
    public int compare(Pizza o1, Pizza o2) {
        return o1.getPreco().compareTo(o2.getPreco());
    }
}
