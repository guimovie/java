import java.util.Arrays;
import java.util.Random;

public class Loteria {
    private final Random random = new Random();

    public int[] gerarNumeros(){
        int[] numeros = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            int numero;
            do {
                numero = random.nextInt(60) + 1;
            } while (existeNumero(numeros, numero).length > 0);
            numeros[i] = numero;
        }
        return numeros;
    }

    public int[] existeNumero(int[] numeros, int numero){
        for (int n : numeros){
            if (n == numero){
                return new int[]{n};
            }
        }
        return new int[0];
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
