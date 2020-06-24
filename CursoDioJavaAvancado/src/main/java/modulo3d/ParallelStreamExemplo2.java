package modulo3d;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExemplo2 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Roberto", "Aline", "Fábio", "Suzana");
        nomes.parallelStream().forEach(System.out::println);

    }
}
