package Model.objeto;

import Model.sessoes.Papelaria;

public class Borracha extends Papelaria {

    private String formato;

    public Borracha(String nome, float preco, int quantidade, String cor, String marca, String especificacoes, String formato) {
        super(nome, preco, quantidade, cor, marca, especificacoes);
        this.setFormato(formato);
    }

    public String getFormato() {return formato;}

    public void setFormato(String formato) {this.formato = formato;}

    public void mostrarValores() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Cor: " + getCor());
        System.out.println("Marca: " + getMarca());
        System.out.println("Especificações: " + getEspecificacoes());
        System.out.println("Formato: " + getFormato());
    }
}
