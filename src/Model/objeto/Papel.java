package Model.objeto;

import Model.sessoes.Papelaria;

public class Papel extends Papelaria {
    private String tipo;

    public Papel(String nome, float preco, int quantidade, String cor, String marca, String especificacoes, String tipo) {
        super(nome, preco, quantidade, cor, marca, especificacoes);
        this.setTipo(tipo);
    }

    public String getTipo() { return tipo; }

    public void setTipo(String tipo) { this.tipo = tipo; }

    public void mostrarValores() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Cor: " + getCor());
        System.out.println("Marca: " + getMarca());
        System.out.println("Especificações: " + getEspecificacoes());
        System.out.println("Tipo: " + getTipo());
    }
}
