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

    public void editarProduto(String nome, float preco, int quantidade, String cor, String marca, String especificacoes, String formato) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
        this.setCor(cor);
        this.setMarca(marca);
        this.setEspecificacoes(especificacoes);
        this.setFormato(formato);
    }
}
