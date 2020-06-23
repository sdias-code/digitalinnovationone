package modulo1;

import java.util.HashMap;
import java.util.Map;

public class ExemploFatorialMemoization {
    static Map<Integer, Integer> MAPA_FATORIAL = new HashMap<>();

    public static void main(String[] args) {
        Long i = System.nanoTime();
        System.out.println(fatorialComMemoization(15));
        Long f = System.nanoTime();
        System.out.println("Fatorial 1: "+(f-i));

        i = System.nanoTime();
        System.out.println(fatorialComMemoization(15));
        f = System.nanoTime();
        System.out.println("Fatorial 2: "+(f-i));
    }

    public static Integer fatorialComMemoization(Integer value){
        if(value == 1){
            return value;
        }else {
            if(MAPA_FATORIAL.containsKey(value)){
                return MAPA_FATORIAL.get(value);
            }else {
                Integer resultado = value *fatorialComMemoization(value-1);
                MAPA_FATORIAL.put(value,resultado);
                return resultado;
            }
        }
    }
}
