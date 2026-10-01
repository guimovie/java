import java.util.Scanner;

public class SumArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o tamanho da lista: ");
        int tamanho = input.nextInt();
        int [] array = new int[tamanho];
        int total = 0;
        
        System.out.println("Digite os valores da lista: ");
        for (int i=0; i<array.length; i++){
            array[i] = input.nextInt();
        }
        for (int i : array){
            total+=i;
        }
        System.out.printf("O total da soma dos itens da lista é igual a %d%n", total);
        
        input.close();
    }
}
