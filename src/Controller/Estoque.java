package Controller;

import Lib.Conversor;
import Lib.input;
import Model.Produto;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Estoque {
    private static ArrayList<Produto> produtos = new ArrayList<Produto>();

    public static void listarProdutos() {
        if (produtos.size() == 0) {
            System.out.println("Nenhum produto a ser listado");
        }

        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            System.out.println((i + 1) + " | " + p.getNome());
            System.out.println("Quantidade: " + p.getQuantidade());
            System.out.println("Preço: " + p.getPreco());
        }
    }

    public static void listarProdutos(String nome) {
        int fakeI = 0;
        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            if (!p.getNome().equals(nome)) { continue; }
            fakeI += 1;
            System.out.println("--// " + fakeI);
            p.mostrarValores();
        }
    }

    public static void inserirProduto(Produto p) { produtos.add(p); }

    public static void removerProduto(Produto p) {
        produtos.remove(p);
    }

    public static void editarProduto(Produto p) {
        Class<?> clazz = p.getClass();

        while (clazz != null && clazz != Object.class) {
            Field[] fields = clazz.getDeclaredFields();

            for (Field field : fields) {
                try {
                    field.setAccessible(true);
                    Object valorAtual = field.get(p);

                    System.out.println(field.getName() + ": " + valorAtual);
                    String valor = input.lerStr("Digite um valor ou aperte Enter para manter:");

                    if (valor.isBlank()) { continue; }

                    field.set( p, Conversor.classeParaValor( field.getType(), valor ) );
                } catch (IllegalAccessException E) {
                    System.out.println(E);
                }
            }

            clazz = clazz.getSuperclass();
        }
    }

    public static ArrayList<Produto> getProdutos() { return produtos; }

    public static void setProdutos(ArrayList<Produto> lista) {
        produtos = lista;
    }
}
