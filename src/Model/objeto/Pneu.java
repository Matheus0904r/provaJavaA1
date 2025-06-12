package Model.objeto;

import Model.sessoes.Ferragens;

public class Pneu extends Ferragens {
    private float diametro;
    private String textura;
    
    public Pneu(String nome, float preco, int quantidade, float peso, String marca, float diametro, String textura) {
        super(nome, preco, quantidade, peso, marca);
        this.setDiametro(diametro);
        this.setTextura(textura);
    }

    public String getTextura() { return textura; }
    public void setTextura(String textura) { this.textura = textura; }

    public float getDiametro() { return diametro; }
    public void setDiametro(float diametro) { this.diametro = diametro; }

    public void editarProduto (String nome, float preco, int quantidade, float peso, String marca, String genero, float diametro, String textura) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
        this.setPeso(peso);
        this.setMarca(marca);
        this.setDiametro(diametro);
        this.setTextura(textura);
    }
}
