package Lib;

public class Conversor {
    public static Object classeParaValor(Class<?> tipo, String valor) {
        try {
            if (tipo == String.class) return valor;
            if (tipo == Integer.class) return Integer.parseInt(valor);
            if (tipo == Float.class) return Float.parseFloat(valor);
            if (tipo == Boolean.class) return Boolean.parseBoolean(valor);
        } catch (NumberFormatException E) {
            System.out.println("Input inválido.");
        }
        return null;
    }

    public static Object stringParaValor(String tipo, String valor) {
        try {
            if (tipo.matches("string")) return valor;
            if (tipo.matches("int")) return Integer.parseInt(valor);
            if (tipo.matches("float")) return Float.parseFloat(valor);
            if (tipo.matches("boolean")) return Boolean.parseBoolean(valor);
        } catch (NumberFormatException E) {
            System.out.println("Input inválido.");
        }
        return null;
    }
}
