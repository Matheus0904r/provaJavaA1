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

    public void editarProduto (String nome, float preco, int quantidade, String cor, String marca, String especificacoes, String tipo) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
        this.setCor(cor);
        this.setMarca(marca);
        this.setEspecificacoes(especificacoes);
        this.setTipo(tipo);
    }
}
