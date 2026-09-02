import java.util.Scanner;

public class Dinheiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int nv = n;
        int notas100 = 0;
        int notas50 = 0;
        int notas20 = 0;
        int notas10 = 0;
        int notas5 = 0;
        int notas2 = 0;
        int notas1 = 0;
        while (n >= 100) {
            n = n-100;
            notas100++;
        }
        while (n >= 50) {
            n = n-50;
            notas50++;
        }
        while (n >= 20) {
            n = n-20;
            notas20++;
        }
        while (n >= 10) {
            n = n-10;
            notas10++;
        }
        while (n >= 5) {
            n = n-5;
            notas5++;
        }
        while (n >= 2) {
            n = n-2;
            notas2++;
        }
        while (n >= 1) {
            n = n-1;
            notas1++;
        }
        System.out.println(nv);
        System.out.printf("%d nota(s) de R$ 100,00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50,00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20,00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10,00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5,00\n", notas5);
        System.out.printf("%d nota(s) de R$ 2,00\n", notas2);
        System.out.printf("%d nota(s) de R$ 1,00\n", notas1);
        input.close();
    }
}