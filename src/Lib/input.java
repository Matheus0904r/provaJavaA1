package Lib;

import java.util.Scanner;

public class input {
    static Scanner scan;

    public input() {
    }

    public static String lerStr(String text) {
        System.out.println(text);
        return scan.nextLine();
    }

    public static int lerInt(String text) {
        System.out.println(text);

        while(true) {
            try {
                int i = Integer.parseInt(scan.nextLine());
                return i;
            } catch (NumberFormatException var2) {
                System.out.println("Input não é um número.");
                System.out.println("Tente novamente.");
            }
        }
    }

    static {
        scan = new Scanner(System.in);
    }
}
