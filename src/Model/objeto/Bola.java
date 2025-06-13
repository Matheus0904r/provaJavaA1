package Model.objeto;

import Model.sessoes.Brinquedo;

import java.io.Serializable;

public class Bola extends Brinquedo {
    private String cor;
    private boolean costurada;

    public Bola (String nome, float preco, int quantidade, String faixaEtaria, String material, String genero, String cor, boolean costurada) {
        super(nome, preco, quantidade, faixaEtaria, material, genero);
        this.setCor(cor);
        this.setCosturada(costurada);
    }

    public String getCor() { return cor; }
    public String getCosturada() { return Boolean.toString(costurada); }
    
    public void setCor(String cor) { this.cor = cor; }
    public void setCosturada(boolean costurada) { this.costurada = costurada; }

    public void mostrarValores() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Faixa Etária: " + getFaixaEtaria());
        System.out.println("Material: " + getMaterial());
        System.out.println("Genero: " + getGenero());
        System.out.println("Cor: " + getCor());
        System.out.println("Costurada: " + getCosturada());
    }
}
