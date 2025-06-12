package Lib;

import java.util.Scanner;

public class input {
    private static final Scanner scan = new Scanner(System.in);

    public static int lerInt(String text) {
        while (true) {
            try {
                System.out.print(text);
                return Integer.parseInt(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Erro: entrada inválida. Digite um número inteiro.");
            }
        }
    }

    public static float lerFloat(String text) {
        while (true) {
            try {
                System.out.print(text);
                return Float.parseFloat(scan.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Erro: entrada inválida. Digite um número decimal.");
            }
        }
    }

    public static String lerStr(String text) {
        System.out.print(text);
        return scan.nextLine();
    }
}
