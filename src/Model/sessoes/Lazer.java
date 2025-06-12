package Model.sessoes;

import Model.Produto;

public abstract class Lazer extends Produto {

    private boolean usoExterno;
    private String capacidade;
    private String material;

    public Lazer(String nome, float preco,int quantidade, boolean usoExterno, String capacidade, String material) {
        super(nome, preco, quantidade);
        this.setUsoExterno(usoExterno);
        this.setCapacidade(capacidade);
        this.setMaterial(material);
    }

    public boolean getUsoExterno() { return usoExterno;}
    public String getCapacidade() { return capacidade; }
    public String getMaterial() { return material; }
    
    public void setUsoExterno(boolean usoExterno) { this.usoExterno = usoExterno; }
    public void setCapacidade(String capacidade) { this.capacidade = capacidade; }
    public void setMaterial(String material) { this.material = material; }
}
