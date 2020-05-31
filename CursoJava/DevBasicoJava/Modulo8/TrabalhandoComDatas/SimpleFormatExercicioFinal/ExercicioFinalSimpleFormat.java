package SimpleFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ExercicioFinalSimpleFormat {
    public static void main(String[] args) {
        Date agora = new Date();

        String minhaData = agora.toString();
        System.out.println(minhaData);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss:SSS");
        System.out.println("Data formatada: "+dateFormat.format(agora));

    }
}
