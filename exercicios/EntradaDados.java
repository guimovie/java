import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu Nome: ");
        String nome = input.nextLine();
        System.out.println("Olá " + nome);

        input.close();
    }
}
