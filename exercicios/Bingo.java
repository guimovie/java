import java.util.Scanner;
import java.util.Random;
public class Bingo {
    private static Scanner input = new Scanner(System.in);
    private static Random random = new Random();
    private static boolean[] sorteados = new boolean[76];
    private static int totalSorteados;
    private static char[] letras = "BINGO".toCharArray();
    public static void main(String[] args){
        int opcao;
        System.out.println("BINGO");
        System.out.println("Escolha uma das opções: ");
        do {
            System.out.println("=================================");
            System.out.println("1. Sorteio | 2. Lista | 3. Sair");
            opcao = input.nextInt();
            switch (opcao) {
                case 1 : sortear(); break;
                case 2 : listar(); break;
                case 3 : System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida");
            }
        } while (opcao != 3);
    }

    public static void listar() {
        System.out.println("Números sorteados:");
        for (int i = 0; i < letras.length; i++) {
            int primeiroNumero = i * 15 + 1;
            System.out.printf("%c |", letras[i]);
            for (int j = 0; j < 15; j++) {
                int numero = primeiroNumero + j;
                System.out.printf("%4s", sorteados[numero] ? numero : "--");
            }
            System.out.println();
        }
    }

    public static void sortear() {
        if (totalSorteados == 75) {
            System.out.println("Todos os números já foram sorteados.");
            return;
        }

        int n;
        do {
            n = random.nextInt(75) + 1;
        } while (sorteados[n]);

        sorteados[n] = true;
        totalSorteados++;
        System.out.printf("Número sorteado: %c %d%n", letras[(n - 1) / 15], n);
    }
}
