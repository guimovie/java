import java.util.Scanner;

public class IndiceMassa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Entrada de dados
        System.out.println("==============================");
        System.out.println("       INSIRA SEUS DADOS      ");
        System.out.println("==============================");
        System.out.print("Nome: ");
        String nome = input.nextLine();
        System.out.print("Peso (kg): ");
        double peso = input.nextDouble();
        System.out.print("Altura (m): ");
        double altura = input.nextDouble();

        // Calculo do IMC
        double imc = peso / (altura * altura);

        // Titulo
        System.out.println("==============================");
        System.out.println("        CÁLCULO DE IMC        ");
        System.out.println("==============================");

        // Saída de dados
        System.out.printf("Nome    : %s\n", nome);
        System.out.printf("Altura  : %.2f\n", altura);
        System.out.printf("Peso    : %.2f\n", peso);
        System.out.printf("IMC     : %.2f\n", imc);
        System.out.print("Classificação: ");
        if (imc <= 18.5) {
            System.out.println("ABAIXO DO PESO");
        } else if (imc < 25) {
            System.out.println("PESO NORMAL");
        } else if (imc < 30) {
            System.out.println("SOBREPESO");
        } else if (imc < 35) {
            System.out.println("OBESIDADE GRAU 1");
        } else if (imc < 40) {
            System.out.println("OBESIDADE GRAU 2");
        } else {
            System.out.println("OBESIDADE GRAU 3");
        }
        input.close();
    }
}
