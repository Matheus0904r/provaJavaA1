package Model.objeto;

import Model.sessoes.Papelaria;

public class Caderno extends Papelaria {

    private int nroFolhas;

    public Caderno(String nome, float preco, int quantidade, String cor, String marca, String especificacoes, int nroFolhas) {
        super(nome, preco, quantidade, cor, marca, especificacoes);
        this.setNroFolhas(nroFolhas);
    }

    public int getNroFolhas() {return nroFolhas;}

    public void setNroFolhas(int nroFolhas) {this.nroFolhas = nroFolhas;}

    public void mostrarValores() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Cor: " + getCor());
        System.out.println("Marca: " + getMarca());
        System.out.println("Especificações: " + getEspecificacoes());
        System.out.println("Número de Folhas: " + getNroFolhas());
    }
}
