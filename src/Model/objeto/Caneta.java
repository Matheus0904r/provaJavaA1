package Model.objeto;

import Model.sessoes.Papelaria;

public abstract class Caneta extends Papelaria {

    private String ponta;

    public Caneta(String nome, float preco, int quantidade, String cor, String marca, String especificacoes, String ponta) {
        super(nome, preco, quantidade, cor, marca, especificacoes);
        this.setPonta(ponta);
    }

    public String getPonta() {return ponta;}

    public void setPonta(String ponta) {this.ponta = ponta;}

    public void editarProduto(String nome, float preco, int quantidade, String cor, String marca, String especificacoes, String ponta) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
        this.setCor(cor);
        this.setMarca(marca);
        this.setEspecificacoes(especificacoes);
        this.setPonta(ponta);
    }
}
