package Model.sessoes;

import Model.Produto;

public abstract class Lazer extends Produto {

    private boolean usoExterno;
    private String capacidade;
    private String material;

    public Lazer(String nome, float preco,int quantidade, boolean usoExterno, String capacidade, String material) {
        super(nome, preco, quantidade);
        this.usoExterno = usoExterno;
        this.capacidade = capacidade;
        this.material = material;
    }


    public boolean getusoExterno() {return usoExterno;}

    public String getcapacidade() {
        return capacidade;
    }

    public String getmaterial() {
        return material;
    }

    public void setUsoExterno(boolean usoExterno) {
        this.usoExterno = usoExterno;
    }

    public void setuso(String capacidade) {
        this.capacidade = capacidade;
    }

    public void setmaterial(String material) {
        this.material = material;
    }


}
