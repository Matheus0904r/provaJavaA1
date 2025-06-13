package Model.objeto;

import Model.sessoes.Pet;

import java.io.Serializable;

public class Coleira extends Pet implements Serializable {
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

    public void mostrarValores() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Uso: " + getUso());
        System.out.println("Tamanho: " + getTamanho());
        System.out.println("Marca: " + getMarca());
        System.out.println("Cor: " + getCor());
        System.out.println("Pingente: " + getPingente());
    }
}
