public class PrintfExemplo {
    public static void main(String[] args) {
        String produto = "Notebook";
        int quantidade = 3;
        double preco = 2500.50;
        double total = preco * quantidade;

        System.out.printf("Produto: %s\n", produto);
        System.out.printf("Unidade(s): %d\n", quantidade);
        System.out.printf("Preço unitario: R$ %.2f\n", preco);
        System.out.printf("Total: R$ %.2f\n", total);
    }
}
