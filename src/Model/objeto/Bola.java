package Model.objeto;

import Model.sessoes.Brinquedo;

public class Bola extends Brinquedo {
    private String cor;
    private boolean costurada;

    public Bola (String nome, float preco, int quantidade, String faixaEtaria, String material, String genero, String cor, boolean costurada) {
        super(nome, preco, quantidade, faixaEtaria, material, genero);
        this.setCor(cor);
        this.setCosturada(costurada);
    }

    public String getCor() { return cor; }
    public boolean isCosturada() { return costurada; }
    
    public void setCor(String cor) { this.cor = cor; }
    public void setCosturada(boolean costurada) { this.costurada = costurada; }

    public void editarProduto(String nome, float preco, int quantidade, String faixaEtaria, String material, String genero, String cor, boolean costurada) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
        this.setFaixaEtaria(faixaEtaria);
        this.setMaterial(material);
        this.setGenero(genero);
        this.setCor(cor);
        this.setCosturada(costurada);
    }
}
