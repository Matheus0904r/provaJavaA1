package Model.objeto;

import Model.sessoes.Pet;

public class RacaoSache extends Pet {
    private String sabor;
    private int ml;

    public RacaoSache (String nome, float preco, int quantidade, String tipo, String uso, float tamanho, String marca, String sabor, int ml) {
        super(nome, preco, quantidade, tipo, uso, tamanho, marca);
        this.setSabor(sabor);
        this.setML(ml);
    }

    public String getSabor() { return this.sabor; }
    public int getML() { return this.ml; }

    public void setSabor(String sabor) { this.sabor = sabor; }
    public void setML(int ml) { this.ml = ml; }

    public void mostrarValores() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Uso: " + getUso());
        System.out.println("Tamanho: " + getTamanho());
        System.out.println("Marca: " + getMarca());
        System.out.println("Sabor: " + getSabor());
        System.out.println("Ml: " + getML());
    }
}