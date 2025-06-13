package Controller;

import Lib.Logging;
import Lib.input;
import Model.Produto;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Estoque {
    private static ArrayList<Produto> produtos = new ArrayList<Produto>();

    public static void listarSimplificadoComId() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto a ser listado");
            return;
        }

        for (int i = 0; i < produtos.size(); i++) {
            Produto p = produtos.get(i);
            System.out.println((i + 1) + " | " + p.getNome());
            System.out.println("Quantidade: " + p.getQuantidade());
            System.out.println("Preço: " + p.getPreco());
        }
    }

    public static void listarSimplificado() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto a ser listado");
            return;
        }

        System.out.println();
        for (Produto p : produtos) {
            System.out.println("Nome: " + p.getNome());
            System.out.println("Quantidade: " + p.getQuantidade());
            System.out.println("Preço: " + p.getPreco());
            System.out.println();
        }
    }

    public static void listarPorNome(String nome) {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto a ser listado");
            return;
        }

        boolean encontrado = false;
        System.out.println();
        for (Produto p : produtos) {
            if (!p.getNome().equals(nome)) { continue; }

            encontrado = true;
            p.mostrarValores();
            System.out.println();
        }
        if (!encontrado) {
            System.out.println("Nenhum produto encontrado com este nome.");
        }
    }

    public static void inserirProduto(Produto p) {
        Logging.registrar("Produto Criado (" + p.getNome() + ")");
        produtos.add(p);
    }

    public static void removerProduto(Produto p) {
        Logging.registrar("Produto Apagado (" + p.getNome() + ")");
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

                    field.set( p, input.converterClasseParaValor( field.getType(), valor ) );
                } catch (IllegalAccessException E) {
                    System.out.println(E);
                }
            }

            clazz = clazz.getSuperclass();
        }

        Logging.registrar("Produto Editado (" + p.getNome() + ")");
    }

    public static ArrayList<Produto> getProdutos() { return produtos; }

    public static void setProdutos(ArrayList<Produto> lista) {
        produtos = lista;
    }
}
