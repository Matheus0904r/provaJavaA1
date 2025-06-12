package Model.objeto;

import Model.sessoes.Pet;

public class Coleira extends Pet {
    private String cor;
    private String pingente;

    public Coleira (String nome, float preco, int quantidade, String tipo, String uso, float tamanho, String marca, String cor, String pingente){
        super(nome, preco, quantidade, tipo, uso, tamanho, marca);
        this.setCor(cor);
        this.setPingente(pingente);

    }

    public String getCor() { return this.cor; }
    public String getPingente() { return this.pingente; }

    public void setCor(String sabor) { this.cor = cor ; }
    public void setPingente(String pingente) { this.pingente = pingente; }

    public void editarProduto(String nome, float preco, int quantidade, String tipo, String uso, float tamanho, String marca, String cor,String pingente){
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
        this.setTipo(tipo);
        this.setUso(uso);
        this.setTamanho(tamanho);
        this.setMarca(marca);
        this.setCor(cor);
        this.setPingente(pingente);
    }
}
