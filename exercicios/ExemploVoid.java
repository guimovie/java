public class ExemploVoid {
    public static void exibirMensagem(String nome){
        System.out.println("====================");
        System.out.println("Olá " + nome + "!");
        System.out.println("Seja bem vindo(a)");
        System.out.println("====================");
    }
    public static void main(String[] args){
        exibirMensagem("João");
        System.out.println();
        exibirMensagem("Maria");
    }
}
