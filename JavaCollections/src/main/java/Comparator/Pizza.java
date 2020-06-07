package Comparator;

public class Pizza {
    private final String sabor;
    private final Integer preco;

    public Pizza(String sabor, Integer preco) {
        this.sabor = sabor;
        this.preco = preco;
    }

    public String getSabor() {
        return sabor;
    }

    public Integer getPreco() {
        return preco;
    }

    @Override
    public String toString(){
        return "Nome: "+this.getSabor() + " - Preço: "+ this.getPreco();
    }
}
