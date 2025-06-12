package Model.objeto;

import Model.Produto;
import Model.sessoes.Lazer;

public class Barraca extends Lazer {
    private float altura;

    public Barraca (String nome, float preco, int quantidade, boolean usoExterno, String capacidade, String material, float Altura) {
        super(nome, preco, quantidade, usoExterno, capacidade, material);
        this.setAltura(altura);
    }

    public float getAltura() { return altura; }

    public void setAltura(float altura) { this.altura = altura; }

    public void mostrarValores() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Uso Externo: " + getUsoExterno());
        System.out.println("Capacidade: " + getCapacidade());
        System.out.println("Material: " + getMaterial());
        System.out.println("Altura: " + getAltura());
    }
}
