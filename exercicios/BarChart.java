import java.util.Scanner;
import java.util.Random;

public class BarChart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o tamanho do seu Histograma: ");
        int tamanho = input.nextInt();
        System.out.println();
        int [] lista = new int[tamanho + 1];

        for (int n = 0; n < lista.length; n++){
            lista[n] = random.nextInt(100);
        }

        System.out.println("============================");
        System.out.println("=== Histograma Aleatório ===");
        System.out.println("============================");
        System.out.println();
        
        for (int i = 0 ; i < lista.length; i++){
            System.out.printf("%03d-%03d ", i, i + 9);

            for (int stars = 0; stars < lista[i]; stars++){
                System.out.print("-");
            }
            System.out.println();
        }
    input.close();
    }
}
