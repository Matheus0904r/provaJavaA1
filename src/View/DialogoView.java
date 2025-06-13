package View;

import Controller.Estoque;
import Lib.Logging;
import Lib.input;
import Model.Produto;

import java.io.File;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Arrays;
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
        // Pegar categoria
        String sessao = "";
        while (sessao.isBlank()) {
            System.out.println("== Categories Disponíveis ==");
            listarArquivosEm("src/Model/sessoes");

            String categoria = input.lerStr("Escolha uma categoria: ");
            System.out.println();

            try {
                Class.forName("Model.sessoes." + categoria);
                sessao = categoria;
            } catch (ClassNotFoundException E) {
                System.out.println("Categoria não existe.");
                Logging.registrar("Erro ao tentar encontrar sessão.");
            } catch (Exception E) {
                System.out.println("Classe não tem construtor.");
                Logging.registrar("Erro ao tentar encontrar sessão");
            }
        }

        // Pegar objeto
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

        // Pedir informações do objeto
        List<Field> todosCampos = new ArrayList<>( Arrays.asList( clazz.getDeclaredFields() ) );
        List<Object> argumentos = new ArrayList<>();
        Class<?> superClasse = clazz.getSuperclass();

        while (superClasse != null && superClasse != Object.class) {
            todosCampos.addAll(0, Arrays.asList(superClasse.getDeclaredFields()));
            superClasse = superClasse.getSuperclass();
        }

        for (Field campo: todosCampos.toArray( new Field[0] )) {
            campo.setAccessible(true);

            String nome = campo.getName();
            Class<?> tipo = campo.getType();

            // Perguntar até responder o tipo certo
            Object convertido;
            do {
                String entrada = input.lerStr(tipo.getSimpleName() + " | Digite o valor para " + nome + ": ");
                convertido = input.converterClasseParaValor(tipo, entrada);
            } while (convertido == null);

            argumentos.add(convertido);
        }

        // Criar objeto
        Constructor<?> construtor = clazz.getDeclaredConstructors()[0];

        System.out.println();
        try {
            Produto produto = (Produto) construtor.newInstance(argumentos.toArray());
            Estoque.inserirProduto(produto);
            System.out.println("Produto adicionado com sucesso!");
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.println("Erro ao criar produto");
            Logging.registrar("Erro na criação do produto");
        }
    }

    public static void editarProduto() {
        Estoque.listarSimplificadoComId();

        ArrayList<Produto> produtos = Estoque.getProdutos();

        if (produtos.isEmpty()) {
            System.out.println("Não existem produtos para ser editado");
            return;
        }

        int i;
        while (true) {
            i = input.lerInt("Escolha um id para editar:") - 1;

            if (i < 0 || i > produtos.size()) { System.out.println("Id inválido."); }
            else { break; }
        }

        Estoque.editarProduto(produtos.get(i));
        System.out.println("Produto editado com sucesso!");
    }

    public static void removerProduto() {
        Estoque.listarSimplificadoComId();

        ArrayList<Produto> produtos = Estoque.getProdutos();
        int i;
        do {
            i = input.lerInt("Escolha um id para remover: ");
            if (i < 0 || i > produtos.size()) { System.out.println("Id inválido."); }
        } while (i < 0 || i > produtos.size());

        Produto deletar = produtos.get(i - 1);

        Estoque.removerProduto(deletar);
        System.out.println("Produto removido com sucesso!");
    }

    public static void listarPorNome() {
        if (Estoque.getProdutos().isEmpty()) {
            System.out.println("Nenhum produto a ser listado");
            return;
        }

        String nome = input.lerStr("Nome do produto que está procurando: ");
        Estoque.listarPorNome( nome );
    }

    public static void listarArquivosEm(String path) {
        File pasta = new File(path);
        File[] arquivos = pasta.listFiles();

        if ( arquivos == null ) {
            Logging.registrar("Arquivos não encontrados.");
            return;
        }

        for (File arquivo : arquivos) {
            System.out.println(arquivo.getName().replace(".java", ""));
        }
    }

    public static void listarClassesDeSessao(String sessao) {
        System.out.println("== Produtos Disponíveis ==");
        File pasta = new File("src/Model/objeto");
        File[] arquivos = pasta.listFiles();

        if ( arquivos == null ) {
            Logging.registrar("Arquivos não encontrados.");
            return;
        }

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


    public static void listarProdutos() {
        Estoque.listarSimplificado();
    }
}
