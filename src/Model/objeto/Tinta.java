package Model.objeto;

import Model.sessoes.Ferragens;

public class Tinta extends Ferragens {

    private String metalica;

    public Tinta(String nome, float preco, int quantidade, float peso, String marca, String metalica) {
        super(nome, preco, quantidade, peso, marca);
        this.setMetalica(metalica);
    }

    public String getMetalica() {
        return metalica;
    }

    public void setMetalica(String metalica) {
        this.metalica = metalica;
    }
    
    public void mostrarValores() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Peso: " + getPeso());
        System.out.println("Marca: " + getMarca());
        System.out.println("Metalica: " + getMetalica());
    }
}
