package Lib;

import Controller.Estoque;
import Model.Produto;
import View.DialogoView;

import java.io.*;
import java.util.ArrayList;

public class Serializador {
    private static final String CAMINHO = "data/produtos.dat";

    public static void salvar() {
        File arquivo = new File(CAMINHO);
        File diretorio = arquivo.getParentFile();

        if (diretorio != null && !diretorio.exists()) {
            diretorio.mkdirs();
        }

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arquivo))) {
            oos.writeObject(Estoque.getProdutos());
            DialogoView.textoSalvamentoSucesso();
        } catch (IOException e) {
            Logging.registrar(e.toString());
            System.out.println(e.getMessage());
            DialogoView.textoSalvamentoFracasso();
        }
    }

    public static ArrayList<Produto> carregar() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CAMINHO))) {

            return (ArrayList<Produto>) ois.readObject();

        } catch (IOException | ClassNotFoundException e) {

            System.out.println(e.getMessage());
            Logging.registrar(e.toString());
            DialogoView.textoCarregamentoFracassado();

            return new ArrayList<>();
        }
    }
}