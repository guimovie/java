public class ExemploMetodo {
    public static int somar(int a, int b){
        int resultado = a + b;
        return resultado;
    }

    public static void main(String[] args){
        int x = 5;
        int y = 3;

        int soma = somar(x, y);

        System.out.printf("%d + %d = %d", x, y, soma);
    }
}
