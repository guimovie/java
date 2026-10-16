import java.util.Scanner;
public class ValidadorAgente {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu Codinome: ");
        String codinome = input.nextLine();
        String regexCodinome = "^Agente-[A-Z]{3}$";
        
        if (codinome.matches(regexCodinome)){
            System.out.println("Codinome Válido");
        } else {
            System.out.println("Codinome Inválido");
        }
        
        System.out.print("Digite sua Senha: ");
        String senha = input.nextLine();
        String regexSenha = "^\\d{4,6}$";
        
        if (senha.matches(regexSenha)){
            System.out.println("Senha Válida");
        } else {
            System.out.println("Senha Inválida");
        }
        input.close();
    }
}
