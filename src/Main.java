import Controller.DialogoController;
import Controller.Estoque;
import Lib.Serializador;

public class Main {
    public static void main(String[] args) {

        Estoque.setProdutos(Serializador.carregar());

        DialogoController.Abrir();

        Serializador.salvar();

    }
}