import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== CALCULADORA ===");
        System.out.print("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        String operacao = input.next();
        
        System.out.print("Digite o segundo número: ");
        double num2 = input.nextDouble();

        double resultado = 0;

        if (operacao.equals("+")) {
            resultado = num1 + num2;
        } else if (operacao.equals("-")) {
            resultado = num1 - num2;
        } else if (operacao.equals("*")) {
            resultado = num1 * num2;
        } else if (operacao.equals("/")) {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.print("Erro: Divisão por ZERO!");
                input.close();
                return;
            }
        } else {
            System.out.println("Operação inválida!");
            input.close();
            return;
        }    

        System.out.printf("%.2f %s %.2f = %.2f\n", num1, operacao, num2, resultado);
        input.close();
    }
}
