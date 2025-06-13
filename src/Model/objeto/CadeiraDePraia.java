package Model.objeto;

import Model.sessoes.Lazer;

import java.io.Serializable;

public abstract class CadeiraDePraia extends Lazer implements Serializable {

    private String posicoes;

    public CadeiraDePraia(String nome, float preco, int quantidade, boolean usoExterno, String capacidade, String material, String posicoes) {
        super(nome, preco, quantidade, usoExterno, capacidade, material);
        this.setPosicoes(posicoes);
    }

    public String getPosicoes() {return posicoes;}

    public void setPosicoes(String posicoes) {this.posicoes = posicoes;}

    public void mostrarValores() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Uso Externo: " + getUsoExterno());
        System.out.println("Capacidade: " + getCapacidade());
        System.out.println("Material: " + getMaterial());
        System.out.println("Posições: " + getPosicoes());
    }
}
