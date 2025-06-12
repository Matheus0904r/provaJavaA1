package Controller;

import View.DialogoView;

public class DialogoController {
    public static void Abrir() {
        int opc;
        do {
            opc = DialogoView.mostrarMenu();
            verificarOpcao(opc);
        } while (opc != 6);
    }

    private static void verificarOpcao(int opc) {
        switch (opc) {
            case 1 -> DialogoView.listar();
            case 2 -> DialogoView.listarPorNome();
            case 3 -> DialogoView.criarProduto();
            case 4 -> DialogoView.editarProduto();
            case 5 -> DialogoView.removerProduto();
            case 6 -> DialogoView.textoEncerrando();
            default -> DialogoView.textoOpcaoInvalida();
        }
    }





}
