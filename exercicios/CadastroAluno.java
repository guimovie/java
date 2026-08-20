import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Titulo
        System.out.println("================================");
        System.out.println("  SISTEMA DE CADASTRO DE ALUNO  ");
        System.out.println("================================");
        System.out.println();
        // Entrada de dados
        System.out.print("Digite o nome do aluno: ");
        String nome = input.nextLine();
        System.out.print("Digite a idade: ");
        int idade = input.nextInt();
        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();
        System.out.print("Digite a terceira nota: ");
        double nota3 = input.nextDouble();

        // Cálculo de média
        double media = (nota1 + nota2 + nota3)/ 3;
        
        // Exibição formatada
        System.out.println();
        System.out.println("================================");
        System.out.println("         FICHA DO ALUNO         ");
        System.out.println("================================");
        System.out.printf("Nome  : %s\n", nome);
        System.out.printf("Idade : %d anos\n", idade);
        System.out.println("-------------------------------");
        System.out.printf("Nota 1: %.1f\n", nota1);
        System.out.printf("Nota 2: %.1f\n", nota2);
        System.out.printf("Nota 3: %.1f\n", nota3);
        System.out.println("-------------------------------");
        System.out.printf("Média : %.2f\n", media);
        
        // Avaliação
        System.out.print("Situação: ");
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        System.out.println("================================");
        System.out.println("       CADASTRO REALIZADO!      ");
        System.out.println("================================");

        input.close();
    }
}
