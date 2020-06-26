package modulo6b;

public class StringRepeat {
    public static void main(String[] args) {
        String nome = "Silvio";
        String aux = "";
        for(int i=0; i<10; i++){
            aux += nome+"\n";
        }
        System.out.println(aux);

        String nome2 = "Joana";
        System.out.println(nome2.repeat(10));
    }
}
