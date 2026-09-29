import java.util.Random;

public class GeradordeDados {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Gerando números aleatorios de 1 a 6");
        System.out.println("-----------------------------------");

        for (int i=1; i<=10; i++) {
            int dado =1 + random.nextInt(6);
            System.out.printf("Jogada nº%d: %d\n", i, dado);
        }
    }
}
