package Model.objeto;

import Model.sessoes.Pet;

import java.io.Serializable;

public class Shampoo extends Pet implements Serializable {
    private String antipulgas;
    private int ml;

    public Shampoo (String nome, float preco, int quantidade, String tipo, String uso, float tamanho, String marca,int ml, String antipulgas) {
        super(nome, preco, quantidade, tipo, uso, tamanho, marca);
        this.setAntipulgas(antipulgas);
        this.setML(ml);
    }

    public String getAntipulgas() { return this.antipulgas; }
    public int getML() { return this.ml; }

    public void setAntipulgas(String antipulgas) {  this.antipulgas = antipulgas; }
    public void setML(int ml) {  this.ml = ml; }

    public void mostrarValores() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Uso: " + getUso());
        System.out.println("Tamanho: " + getTamanho());
        System.out.println("Marca: " + getMarca());
        System.out.println("Ml: " + getML());
        System.out.println("Antipulgas: " + getAntipulgas());
    }
}
