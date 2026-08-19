public class PrintfAvancado {
    public static void main(String[] args) {
        String nome1 = "João";
        int idade1 = 25;
        double salario1 = 2500.50;

        String nome2 = "Maria";
        int idade2 = 30;
        double salario2 = 3500;
        
        System.out.println("========================================");
        System.out.printf("| %-15s | %5s | %10s |\n", "Nome", "Idade", "Salário");
        System.out.println("========================================");
        System.out.printf("| %-15s | %5s | R$ %7.2f |\n", nome1, idade1, salario1);
        System.out.printf("| %-15s | %5s | R$ %7.2f |\n", nome2, idade2, salario2);
        System.out.println("========================================");
    }
}
