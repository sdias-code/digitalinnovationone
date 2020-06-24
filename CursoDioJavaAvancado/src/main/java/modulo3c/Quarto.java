package modulo3c;

import java.util.Arrays;
import java.util.List;

public class Quarto extends Comodo{

    @Override
    List<Atividade> obterAfazeresDoComodo() {
        return Arrays.asList(
                this::arrumarACama,
                this::varrerOQuarto,
                this::arrumarGuardaRoupa
        );
    }

    private String arrumarGuardaRoupa() throws InterruptedException{
        Thread.sleep(5000);
        String arrumarOGuardaRoupa = "Arrumar o guarda roupa";
        System.out.println(arrumarOGuardaRoupa);
        return arrumarOGuardaRoupa;
    }

    private String varrerOQuarto() throws InterruptedException{
        Thread.sleep(7000);
        String varrerOQuarto = "Varrer o quarto";
        System.out.println(varrerOQuarto);
        return varrerOQuarto;
    }

    private String arrumarACama() throws InterruptedException{
        Thread.sleep(10000);
        String arrumarACama = "Arrumar a cama";
        System.out.println(arrumarACama);
        return arrumarACama;
    }
}
