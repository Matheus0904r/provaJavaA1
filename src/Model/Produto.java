package Model;

import Lib.*;

import java.lang.reflect.Field;

public abstract class Produto {
    private String nome;
    private float preco;
    private int quantidade;

    public Produto(String nome, float preco, int quantidade) {
        this.setNome(nome);
        this.setPreco(preco);
        this.setQuantidade(quantidade);
    }

    public String getNome() { return nome; }
    public int getQuantidade() { return quantidade; }
    public float getPreco() { return preco; }
    
    public void setNome(String nome) { this.nome = nome; }
    public void setPreco(float preco) { this.preco = preco; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public abstract void mostrarValores();

    public String toString(Produto p) {
        String string = "";

        Class<?> clazz = p.getClass();

        while (clazz != null && clazz != Object.class) {
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {
                try {
                    field.setAccessible(true);
                    string = string + (string.isBlank() ? "" : ",") + field.getName() + ":" + field.get(p) + ":" + field.getType();
                } catch (IllegalAccessException E) {
                    System.out.println(E);
                }
            }

            clazz = clazz.getSuperclass();
        }

        return string;
    }
}
