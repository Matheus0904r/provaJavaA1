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

    public void editaProduto(String nome, float preco, int quantidade, float peso, String marca, String metalica) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
        this.setPeso(peso);
        this.setMarca(marca);
        this.setMetalica(metalica);
    }
}
