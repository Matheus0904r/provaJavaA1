package Model.sessoes;

import Model.Produto;

public abstract class Brinquedo extends Produto {

    private String faixaEtaria;
    private String material;
    private String genero;

    public Brinquedo (String nome, float preco, int quantidade, String faixaEtaria, String material, String genero){
        super(nome, preco, quantidade);
        this.setFaixaEtaria(faixaEtaria);
        this.setMaterial(material);
        this.setGenero(genero);
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public String getMaterial() {
        return material;
    }

    public String getGenero() {
        return genero;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}


