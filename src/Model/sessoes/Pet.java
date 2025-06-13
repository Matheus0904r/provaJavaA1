package Model.sessoes;


import Model.Produto;

import java.io.Serializable;

public abstract class Pet extends Produto implements Serializable {

    private String tipo;
    private String uso;
    private float tamanho;
    private String marca;

    public Pet(String nome, float preco, int quantidade, String tipo, String uso, float tamanho, String marca) {
        super(nome, preco, quantidade);
        this.setTipo(tipo);
        this.setUso(uso);
        this.setTamanho(tamanho);
        this.setMarca(marca);
    }

    public String getTipo() { return tipo; }
    public String getUso() { return uso; }
    public float getTamanho() { return tamanho; }
    public String getMarca() { return marca; }
    
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setUso(String uso) { this.uso = uso; }
    public void setTamanho(float tamanho) { this.tamanho = tamanho; }
    public void setMarca(String marca) { this.marca = marca; }
}
