package Lib;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logging {
    public static void registrar(String mensagem) {
        try (FileWriter writer = new FileWriter("data/sistema.log", true)) {
            writer.write(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy | HH:mm:ss")) + " - " + mensagem + "\n");
        } catch (IOException e) {
            System.out.println("Erro ao escrever no log.");
        }
    }
}