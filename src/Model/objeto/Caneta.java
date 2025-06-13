package Model.objeto;

import Model.sessoes.Papelaria;

import java.io.Serializable;

public class Caneta extends Papelaria implements Serializable {

    private String ponta;

    public Caneta(String nome, float preco, int quantidade, String cor, String marca, String especificacoes, String ponta) {
        super(nome, preco, quantidade, cor, marca, especificacoes);
        this.setPonta(ponta);
    }

    public String getPonta() {return ponta;}

    public void setPonta(String ponta) {this.ponta = ponta;}

    public void mostrarValores() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Cor: " + getCor());
        System.out.println("Marca: " + getMarca());
        System.out.println("Especificações: " + getEspecificacoes());
        System.out.println("Ponta: " + getPonta());
    }
}
