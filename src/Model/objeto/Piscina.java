package Model.objeto;

import Model.sessoes.Lazer;

public class Piscina extends Lazer{

    private float litros;

    public Piscina(String nome, float preco, int quantidade, boolean usoExterno, String capacidade, String material, float litros) {
        super(nome, preco, quantidade, usoExterno, capacidade, material);
        this.setLitros(litros);
    }

    public float getLitros() { return litros ; }

    public void setLitros(float litros) { this.litros = litros; }

    public void editarProduto(String nome, float preco, int quantidade, boolean usoExterno, String capacidade, String material, float litros) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
        this.setUsoExterno(usoExterno);
        this.setCapacidade(capacidade);
        this.setMaterial(material);
        this.setLitros(litros);
    }

}
