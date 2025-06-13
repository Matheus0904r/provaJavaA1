package View;

import Controller.Estoque;
import Lib.Conversor;
import Lib.Logging;
import Lib.input;
import Model.Produto;

import java.io.File;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class DialogoView {


    public static int mostrarMenu() {
        System.out.println("\n===== Gerenciamento de Estoque  =====");
        System.out.println("1. Ver Produtos");
        System.out.println("2. Procurar Produto");
        System.out.println("3. Adicionar Produto");
        System.out.println("4. Editar Produto");
        System.out.println("5. Remover Produto");
        System.out.println("6. Sair");

        return input.lerInt("Escolha: ");
    }

    public static void criarProduto() {
        Object obj = null;
        String sessao = "";
        while (sessao.isBlank()) {
            System.out.println("== Categories Disponíveis ==");
            listarArquivosEm("src/Model/sessoes");
            String categoria = input.lerStr("Escolha uma categoria: ");

            try {
                obj = Class.forName("Model.sessoes." + categoria);
                sessao = categoria;
            } catch (ClassNotFoundException E) {
                System.out.println("Categoria não existe.");
                Logging.registrar("Erro ao tentar encontrar sessão.");
            } catch (Exception E) {
                System.out.println("Classe não tem construtor.");
                Logging.registrar("Erro ao tentar encontrar sessão");
            }
        }

        Class<?> clazz = null;
        String produtoTipo = "";
        while (clazz == null) {
            listarClassesDeSessao(sessao);
            produtoTipo = input.lerStr("Escolha um produto: ");

            try {
                Class<?> classe = Class.forName("Model.objeto." + produtoTipo);

                Class<?> superClasse = classe.getSuperclass();
                if (!superClasse.getSimpleName().equals(sessao)) { continue; }

                clazz = classe;
            } catch (ClassNotFoundException E) {
                System.out.println("Classe não encontrada.");
                Logging.registrar("Classe não existe");
            }
        }

        Constructor<?> construtor = clazz.getDeclaredConstructors()[0];
        Field[] campos = clazz.getDeclaredFields();
        List<Field> todosCampos = new ArrayList<>(Arrays.asList(campos));
        List<Object> argumentos = new ArrayList<>();
        // Class<?>[] tiposParametros = construtor.getParameterTypes();
        Class<?> superClasse = clazz.getSuperclass();

        while (superClasse != null && superClasse != Object.class) {
            todosCampos.addAll(0, Arrays.asList(superClasse.getDeclaredFields()));
            superClasse = superClasse.getSuperclass();
        }

        campos = todosCampos.toArray(new Field[0]);

        for (Field campo: campos) {
            campo.setAccessible(true);

            String nome = campo.getName();
            Class<?> tipo = campo.getType();

            String entrada = input.lerStr("Digite o valor para (" + tipo.getSimpleName() + ") " + nome + ": ");

            Object convertido = Conversor.classeParaValor(tipo, entrada);
            argumentos.add(convertido);
        }

        try {
            Produto produto = (Produto) construtor.newInstance(argumentos.toArray());
            Estoque.inserirProduto(produto);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.println("Erro ao criar produto");
            Logging.registrar("Erro na criação do produto");
        }
    }

    public static void editarProduto() {
        Estoque.listarProdutos();

        ArrayList<Produto> produtos = Estoque.getProdutos();

        if (produtos.size() == 0) {
            System.out.println("Não existem produtos para ser editado");
            return;
        }

        int i = -1;
        do {
            i = input.lerInt("Escolha um id para editar: ");
            if (i < 0 || i > produtos.size()) { System.out.println("Id inválido."); }
        } while (i < 0 || i > produtos.size());

        Estoque.editarProduto(produtos.get(i - 1));
    }

    public static void removerProduto() {
        Estoque.listarProdutos();

        ArrayList<Produto> produtos = Estoque.getProdutos();
        int i = -1;
        do {
            i = input.lerInt("Escolha um id para remover: ");
            if (i < 0 || i > produtos.size()) { System.out.println("Id inválido."); }
        } while (i < 0 || i > produtos.size());

        Produto deletar = produtos.get(i - 1);

        Estoque.removerProduto(deletar);
    }

    public static void listar() {
        Estoque.listarProdutos();
    }

    public static void listarPorNome() {
        String nome = input.lerStr("Nome do produto que está procurando: ");
        Estoque.listarProdutos( nome );
    }

    public static void listarArquivosEm(String path) {
        File pasta = new File(path);
        File[] arquivos = pasta.listFiles();

        for (File arquivo : arquivos) {
            System.out.println(arquivo.getName().replace(".java", ""));
        }
    }

    public static void listarClassesDeSessao(String sessao) {
        System.out.println("== Produtos Disponíveis ==");
        File pasta = new File("src/Model/objeto");
        File[] arquivos = pasta.listFiles();

        for (File arquivo: arquivos) {
            String nomeCompleto = "Model.objeto." + arquivo.getName().replace(".java", "");
            try {
                Class<?> clazz = Class.forName(nomeCompleto);
                Class<?> superClazz = clazz.getSuperclass();
                if (!superClazz.getSimpleName().equals(sessao)) { continue; }
                System.out.println(clazz.getSimpleName());
            } catch (ClassNotFoundException E) {
                System.out.println("not found");
            }
        }
    }

    public static void textoEncerrando() { System.out.println("Encerrando..."); }
    public static void textoOpcaoInvalida() { System.out.println("Opção inválida!"); }
    public static void textoSalvamentoSucesso() { System.out.println("Produtos salvos com sucesso!"); }
    public static void textoSalvamentoFracasso() { System.out.println("Erro ao salvar os produtos! (Verificar Logs)"); }
    public static void textoCarregamentoFracassado() { System.out.println("Erro ao carregar produtos!"); }


}
