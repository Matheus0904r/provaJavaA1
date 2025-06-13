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

    public static String lerStr(String text) {
        System.out.print(text);
        return scan.nextLine();
    }

    public static Object converterClasseParaValor(Class<?> tipo, String valor) {
        try {
            if (tipo == String.class) return valor;
            if (tipo == Integer.class || tipo == int.class) return Integer.parseInt(valor);
            if (tipo == Float.class || tipo == float.class) return Float.parseFloat(valor.replace(",", ".") + "f");
            if (tipo == Boolean.class || tipo == boolean.class) return Boolean.parseBoolean(valor);
        } catch (NumberFormatException E) {
            System.out.println("Input inválido.");
        }
        return null;
    }
}
