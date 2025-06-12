package Model.objeto;

import Model.sessoes.Pet;

public class Shampoo extends Pet {
    private String antipulgas;
    private int ml;

    public Shampoo (String nome, float preco, int quantidade, String tipo, String uso, float tamanho, String marca,int ml, String antipulgas) {
        super(nome, preco, quantidade, tipo, uso, tamanho, marca);
        this.setAntipulgas(antipulgas);
        this.setML(ml);

    }

    public String getAntipulgas() { return this.antipulgas; }
    public int getMl() { return this.ml; }

    public void setAntipulgas(String antipulgas) {  this.antipulgas = antipulgas; }
    public void setML(int ml) {  this.ml = ml; }

    public void editarProduto(String nome, float preco, int quantidade, String tipo, String uso, float tamanho, String marca, int ml, String antipulgas){
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
        this.setTipo(tipo);
        this.setUso(uso);
        this.setTamanho(tamanho);
        this.setMarca(marca);
        this.setML(ml);
        this.setAntipulgas(antipulgas);
    }

}
