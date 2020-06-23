package modulo2;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exemplo06Arrays {
    public static void main(String[] args) {

        String[] nomes = {"Jorge", "Camila", "Suzana", "Bruno", "Diego", "Erica"};
        Integer[] numeros = {22, 49, 51, 27, 36};
        //imprimirNomesFiltrados(nomes);
        //imprimirNomesStream(nomes);
        imprimirTodosNomes(nomes);
        //imprimirTodosNumeros(numeros);
        imprimirTodosNomesStream(nomes);

    }

    public static void imprimirNomesFiltrados(String... nomes){
        String nomesParaImprimir = "";
        System.out.println("Imprimindo nomes filtrados:");
        for( int i=0; i< nomes.length; i++){
            if(nomes[i].equals("Jorge")){
                nomesParaImprimir += " "+ nomes[i];
            }
        }
        System.out.println("Nomes do for: "+ nomesParaImprimir);
    }

    public static void imprimirNomesStream(String... nomes){
        String imprimeNomes = Stream.of(nomes)
                .filter(nome-> nome.equals("Camila"))
                .collect(Collectors.joining());
        System.out.println("Nomes da Stream: "+imprimeNomes);
    }
    public static void imprimirTodosNomes(String... nomes){
        System.out.println("Imprimindo todos os "+ nomes.length+" nomes:");
        for(String nome: nomes){
            System.out.println(nome);
        }
    }
    public static void imprimirTodosNomesStream(String... nomes){
        System.out.println("Imprimindo Nomes ordenados:");
        Arrays.sort(nomes);
        Stream.of(nomes).forEach(System.out::println);
    }

    public static void imprimirTodosNumeros(Integer... numeros){
        Arrays.sort(numeros);
        System.out.println("Imprimindo os "+ numeros.length +" números ordenados: ");
        for(Integer num: numeros){
            System.out.println(num);
        }
    }
}
