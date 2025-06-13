package Model.objeto;

import Model.sessoes.Lazer;

import java.io.Serializable;

public class Piscina extends Lazer implements Serializable {

    private float litros;

    public Piscina(String nome, float preco, int quantidade, boolean usoExterno, String capacidade, String material, float litros) {
        super(nome, preco, quantidade, usoExterno, capacidade, material);
        this.setLitros(litros);
    }

    public float getLitros() { return litros ; }

    public void setLitros(float litros) { this.litros = litros; }

    public void mostrarValores() {
        System.out.println("Nome: " + getNome());
        System.out.println("Preço: " + getPreco());
        System.out.println("Quantidade: " + getQuantidade());
        System.out.println("Uso Externo: " + getUsoExterno());
        System.out.println("Capacidade: " + getCapacidade());
        System.out.println("Material: " + getMaterial());
        System.out.println("Litros: " + getLitros());
    }
}
