package Lib;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logging {
    public static void registrar(String mensagem) {
        try (FileWriter writer = new FileWriter("logs/sistema.log", true)) {
            writer.write(LocalDateTime.now() + " - " + mensagem + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no log.");
        }
    }
}