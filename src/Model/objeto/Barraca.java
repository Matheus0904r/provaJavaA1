package Model.objeto;

import Model.interfaces.Usado;
import Model.sessoes.Lazer;

import java.io.Serializable;

public class Barraca extends Lazer implements Usado, Serializable {
    private float altura;
    private boolean usado;

    public Barraca (String nome, float preco, int quantidade, boolean usoExterno, String capacidade, String material, float Altura, boolean usado) {
        super(nome, preco, quantidade, usoExterno, capacidade, material);
        this.setAltura(altura);
        this.setUsado(usado);
    }

    public float getAltura() { return altura; }
    @Override
    public String getUsado() { return Boolean.toString(usado); }

    public void setAltura(float altura) { this.altura = altura; }
    @Override
    public void setUsado(boolean usado) { this.usado = usado; }

    public void mostrarValores() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Uso Externo: " + getUsoExterno());
        System.out.println("Capacidade: " + getCapacidade());
        System.out.println("Material: " + getMaterial());
        System.out.println("Altura: " + getAltura());
        System.out.println("Usado: " + getUsado());
    }
}
