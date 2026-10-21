import javax.swing.JOptionPane;
public class ValidadorRegEx {
    public static void main(String[] args){
        String st;
        String validadorNome = "^((?=[A-Za-z\\s]{5,50}$)[A-Za-z]{2,}\\s[A-Za-z]{2,})$";

        do {
            st = JOptionPane.showInputDialog(null, "Digite seu Nome e seu ultimo Sobrenome");
            if (st.matches(validadorNome)){
                JOptionPane.showMessageDialog(null, String.format("Nome válido: %s", st), "Mensagem", JOptionPane.PLAIN_MESSAGE);
                System.exit(0);
            } else JOptionPane.showMessageDialog(null, "Nome Inválido!", "Erro!", JOptionPane.ERROR_MESSAGE);
        } while (!st.matches(validadorNome));
    }
}
