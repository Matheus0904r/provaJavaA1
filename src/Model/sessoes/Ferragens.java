package Model.sessoes;

import Model.Produto;

import java.io.Serializable;

public abstract class Ferragens extends Produto implements Serializable {

    private float peso;
    private String marca;

    public Ferragens(String nome, float preco, int quantidade, float peso, String marca) {
        super(nome, preco, quantidade);
        this.setPeso(peso);
        this.setMarca(marca);
    }

    public float getPeso() {return peso;}

    public String getMarca() {return marca;}

    public void setPeso(float peso) {this.peso = peso;}

    public void setMarca(String marca) {this.marca = marca;}
}
