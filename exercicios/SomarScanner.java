import java.util.Scanner;

public class SomarScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num1 = input.nextInt();

        System.out.print("Digite outro número: ");
        int num2 = input.nextInt();

        int soma = num1 + num2;

        System.out.printf("A soma de %d + %d = %d", num1, num2, soma);

        input.close();
    }
}
