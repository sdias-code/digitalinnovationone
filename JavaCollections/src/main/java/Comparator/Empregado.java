package Comparator;

public class Empregado {
    private final String nome;
    private final Integer idade;

    public Empregado(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    @Override
    public String toString(){

        return nome + " - "+ idade;
    }
}
