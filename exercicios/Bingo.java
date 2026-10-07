import java.util.Scanner;
import java.util.Random;
public class Bingo {
    static Scanner input = new Scanner(System.in);
    Random random = new Random();
    private static int Bingo[] = new int[76];
    public static void main(String[] args){
        int opcao;
        System.out.println("BINGO");
        do {
            System.out.println("1. Sorteia | 2. Lista | 3. Saindo");
            opcao = input.nextInt();
            switch (opcao) {
                case 1 : System.out.println("Sorteia"); break;
                case 2 : System.out.println("Lista"); break;
                case 3 : System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida");
            }
        } while (opcao != 3);
    }
    public static void Listar() {
        System.out.println("Lista");
    }
}
