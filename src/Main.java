import Controller.DialogoController;
import Controller.Estoque;
import Lib.Serializador;
import Model.Produto;
import Model.objeto.Bola;
import Model.objeto.Caneta;

import java.io.File;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        Serializador.carregar();
        Estoque.setProdutos(Serializador.carregar());

        DialogoController.Abrir();

        Serializador.salvar();

    }
}