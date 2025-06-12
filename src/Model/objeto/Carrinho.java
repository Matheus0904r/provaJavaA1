package Model.objeto;

import Model.sessoes.Brinquedo;

public class Carrinho extends Brinquedo {
    private String cor;
    private String roda;

    public Carrinho(String nome, float preco, int quantidade, String faixaEtaria, String material, String genero, String cor, String roda) {
        super(nome, preco, quantidade, faixaEtaria, material, genero);
        this.setCor(cor);
        this.setRoda(roda);
    }

    public String getCor() {return cor;}
    public String getRoda() { return roda;}

    public void setRoda(String roda) { this.roda = roda;}
    public void setCor(String cor) { this.cor = cor; }

    public void editarProduto (String nome, float preco, int quantidade, String faixaEtaria, String material, String genero, String cor, String roda) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
        this.setFaixaEtaria(faixaEtaria);
        this.setMaterial(material);
        this.setGenero(genero);
        this.setCor(cor);
        this.setRoda(roda);
    }
    public String toString() {
        return "Nome: " + this.getNome() +
                "Preço: " + this.getPreco() +
                "Quantidade: " + this.getQuantidade() +
                "Faixa etaria: " + this.getFaixaEtaria() +
                "Material: " + this.getMaterial() +
                "Genero: " + this.getGenero() +
                "Cor: " + this.getCor() +
                "Roda: " + this.getRoda();
    }
}
