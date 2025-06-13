package Model;

import java.io.Serializable;

public abstract class Produto implements Serializable {
    private String nome;
    private float preco;
    private int quantidade;

    public Produto(String nome, float preco, int quantidade) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
    }

    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }
    public float getPreco() { return preco; }
    
    public void setNome(String nome) { this.nome = nome; }
    public void setPreco(float preco) { this.preco = preco; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public abstract void mostrarValores();
}
