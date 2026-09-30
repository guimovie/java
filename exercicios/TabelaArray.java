public class TabelaArray {
    public static void main(String[] args) {
        int[] lista = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        System.out.printf("%s%9s\n", "Índice", "Número");
        System.out.println("=================");

        for (int i = 0; i < lista.length; i++) {
            System.out.printf("%4d%8d\n", i, lista[i]);
        }
    }
}
