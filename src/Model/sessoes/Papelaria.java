package Model.sessoes;

import Model.Produto;

import java.io.Serializable;

public abstract class Papelaria extends Produto implements Serializable {

    private String cor;
    private String marca;
    private String especificacoes;

    public Papelaria(String nome, float preco, int quantidade, String cor, String marca, String especificacoes) {
        super(nome, preco, quantidade);
        this.setCor(cor);
        this.setMarca(marca);
        this.setEspecificacoes(especificacoes);
    }

    public String getCor() { return cor; }
    public String getMarca() { return marca; }
    public String getEspecificacoes() { return especificacoes; }
    
    public void setCor(String cor) { this.cor = cor; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setEspecificacoes(String especificacoes) { this.especificacoes = especificacoes; }

}
