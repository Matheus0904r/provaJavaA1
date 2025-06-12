package Model.objeto;

import Model.sessoes.Brinquedo;

public class Boneca  extends Brinquedo {
    private String cor;
    private String roupa;


    public Boneca (String nome, float preco, int quantidade, String faixaEtaria, String material, String genero, String cor, String roupa) {
        super(nome, preco, quantidade, faixaEtaria, material, genero);
        this.setCor(cor);
        this.setRoupa(roupa);

    }

    public String getCor() { return cor;}

    public String getRoupa() {return roupa; }

    public void setCor(String cor) {this.cor = cor; }

    public void setRoupa(String roupa) { this.roupa = roupa ; }

    public void editarProduto(String nome, float preco, int quantidade, String faixaEtaria, String material, String genero, String cor, String roupa){
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
        this.setFaixaEtaria(faixaEtaria);
        this.setMaterial(material);
        this.setGenero(genero);
        this.setCor(cor);
        this.setRoupa(roupa);
    }
}
