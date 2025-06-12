package View;


import Lib.input;

public class DialogoView {

    public static void executar() {
        int opc;
        do {
            opc = mostrarMenu();
            verificarOpcao(opc);
        } while (opc != 6);
    }

    private static void verificarOpcao(int opc) {
        switch (opc) {
            case 1 -> incluirProduto();
            case 2 -> editarProduto();
            case 3 -> excluir();
            case 4 -> consultar();
            case 5 -> listar();
            case 6 -> System.out.println("Encerrando...");
            default -> System.out.println("Opção inválida!");
        }
    }

    private static int mostrarMenu() {
        System.out.println("\n===== AGENDA DE CONTATOS  =====");
        System.out.println("1. Incluir Pessoal");
        System.out.println("2. Incluir Comercial");
        System.out.println("3. Excluir contato");
        System.out.println("4. Consultar contato");
        System.out.println("5. Listar todos");
        System.out.println("6. Sair");

        return input.lerInt("Escolha: ");
    }

    private static void incluirProduto() {
        int quant = input.lerInt("quantidade: ");
        String nome = input.lerStr("Nome: ");
        float preco = input.lerFloat("preço");

    }

    private static void editarProduto() {
        int quant = input.lerInt("quantidade: ");
        String nome = input.lerStr("Nome: ");
        float preco = input.lerFloat("preço");
    }

    private static void excluir() {
        int id  = input.lerInt("Id: ");

    }
    private static void consultar() {
        int id = input.lerInt("ID: ");

    }
    private static void listar() {

    }

}
