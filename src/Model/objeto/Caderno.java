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


    public void editarProduto(String nome, float preco, int quantidade, String cor, String marca, String especificacoes, int nroFolhas) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
        this.setCor(cor);
        this.setMarca(marca);
        this.setEspecificacoes(especificacoes);
        this.setNroFolhas(nroFolhas);
    }
}
