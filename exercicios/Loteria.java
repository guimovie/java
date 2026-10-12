import java.util.Arrays;
import java.util.Random;

public class Loteria {
    private final Random random = new Random();

    public int[] gerarNumeros(){
        int[] numeros = new int[6];

        for (int i = 0; i < numeros.length; i++) {
            int numero;
            boolean repetido;
            do {
                numero = random.nextInt(60) + 1;
                repetido = false;
                for (int j = 0; j < i; j++) {
                    if (numeros[j] == numero) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);
            numeros[i] = numero;
        }
        return numeros;
    }

    public static void main(String[] args){
        System.out.println("  NÚMEROS SORTEADOS");
        System.out.println("=====================");
        System.out.print("Números gerados: ");
        int[] numeros = new Loteria().gerarNumeros();
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++){
            System.out.printf("%d ", numeros[i]);
        }

    }
}
