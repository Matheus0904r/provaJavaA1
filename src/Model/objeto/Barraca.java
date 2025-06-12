package Model.objeto;

import Model.sessoes.Lazer;

public class Barraca extends Lazer {
    private float altura;

    public Barraca (String nome, float preco, int quantidade, boolean usoExterno, String capacidade, String material, float Altura) {
        super(nome, preco, quantidade, usoExterno, capacidade, material);
        this.setAltura(altura);
    }

    public float getAltura() { return altura; }

    public void setAltura(float altura) { this.altura = altura; }

    public void editarProduto(String nome, float preco, int quantidade, boolean usoExterno, String capacidade, String material, String cor, boolean costurada) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
        this.setUsoExterno(usoExterno);
        this.setCapacidade(capacidade);
        this.setMaterial(material);
        this.setAltura(altura);
    }
}
