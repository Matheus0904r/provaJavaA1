package Lib;

import Controller.Estoque;
import Model.Produto;
import View.DialogoView;

import java.io.*;
import java.util.ArrayList;

public class Serializador {
    private static final String CAMINHO = "data/jogos.ser";

    public static void salvar() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CAMINHO))) {
            oos.writeObject(Estoque.getProdutos());
            DialogoView.textoSalvamentoSucesso();
        } catch (IOException e) {
            Logging.registrar(e.toString());
            DialogoView.textoSalvamentoFracasso();
        }
    }

    public static void salvar(ArrayList<Produto> produtos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(CAMINHO))) {
            oos.writeObject(produtos);
            DialogoView.textoSalvamentoSucesso();
        } catch (IOException e) {
            Logging.registrar(e.toString());
            DialogoView.textoSalvamentoFracasso();
        }
    }

    public static ArrayList<Produto> carregar() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CAMINHO))) {

            return (ArrayList<Produto>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {

            Logging.registrar(e.toString());
            DialogoView.textoCarregamentoFracassado();

            return new ArrayList<>();
        }
    }
}