package modulo1;

public class Exemplo5 {
    public static void main(String[] args) {
        ExemploInterface1 novaString = p -> p;
        String nome = "Silvio Dias";
        System.out.println(novaString.gerarLetras(nome));

        ExemploInterface1 addPrefixoNome = valor -> "Sr. "+valor;
        System.out.println(addPrefixoNome.gerarLetras("Roberto Carlos"));

    }
}
