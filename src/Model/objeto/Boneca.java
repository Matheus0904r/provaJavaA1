package Model.objeto;

import Model.sessoes.Brinquedo;

public class Boneca extends Brinquedo {
    private String cor;
    private String roupa;

    public Boneca (String nome, float preco, int quantidade, String faixaEtaria, String material, String genero, String cor, String roupa) {
        super(nome, preco, quantidade, faixaEtaria, material, genero);
        this.setCor(cor);
        this.setRoupa(roupa);
    }

    public String getCor() { return cor; }
    public String getRoupa() { return roupa; }

    public void setCor(String cor) { this.cor = cor; }
    public void setRoupa(String roupa) { this.roupa = roupa; }

    public void mostrarValores() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Faixa Etária: " + getFaixaEtaria());
        System.out.println("Material: " + getMaterial());
        System.out.println("Genero: " + getGenero());
        System.out.println("Cor: " + getCor());
        System.out.println("Roupa: " + getRoupa());
    }
}
