package Model.objeto;

import Model.sessoes.Lazer;

public abstract class CadeiraDePraia extends Lazer {

    private String posicoes;

    public CadeiraDePraia(String nome, float preco, int quantidade, boolean usoExterno, String capacidade, String material, String posicoes) {
        super(nome, preco, quantidade, usoExterno, capacidade, material);
        this.setPosicoes(posicoes);
    }

    public String getPosicoes() {return posicoes;}

    public void setPosicoes(String posicoes) {this.posicoes = posicoes;}

    public void editarProduto(String nome, float preco, int quantidade, boolean usoExterno, String capacidade, String material, String posicoes) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
        this.setUsoExterno(usoExterno);
        this.setCapacidade(capacidade);
        this.setMaterial(material);
        this.setPosicoes(posicoes);
    }
}
