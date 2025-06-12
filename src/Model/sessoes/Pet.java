package Model.sessoes;


import Model.Produto;

public abstract class Pet extends Produto {

    private String tipo;
    private String uso;
    private float tamanho;
    private String marca;

    public Pet(String nome, float preco, int quantidade, String tipo, String uso, float tamanho, String marca) {
        super(nome, preco, quantidade);
        this.tipo = tipo;
        this.uso = uso;
        this.tamanho = tamanho;
        this.marca = marca;
    }

    public String gettipo() {
        return tipo;
    }

    public String getuso() {
        return uso;
    }

    public String getmarca() {
        return marca;
    }

    public void settipo(String tipo) {
        this.tipo = tipo;
    }

    public void setuso(String uso) {
        this.uso = uso;
    }

    public void settamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public void setmarca(String marca) {
        this.marca = marca;
    }

    protected abstract void editarProduto(String nome, float preco, int quantidade, String tipo, String uso, float tamanho, String marca);

}
