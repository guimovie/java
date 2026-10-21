import javax.swing.JOptionPane;
public class Conceito {
    public static void main (String[] args){
        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double media = 0;
        String st;

        do {
            st = JOptionPane.showInputDialog(null, "Informe sua primeira nota");
            if (st == null){
                JOptionPane.showMessageDialog(null, "Saindo...");
                System.exit(0);
            } else if (st.length() == 0){
                JOptionPane.showMessageDialog(null, "É necessario inserir uma nota!", "Erro!", 0);
            } else nota1 = Double.parseDouble(st);
        } while (st == null || st.length() == 0);
        
        do {
            st = JOptionPane.showInputDialog(null, "Informe sua segunda nota");
            if (st == null){
                JOptionPane.showMessageDialog(null, "Saindo...");
                System.exit(0);
            } else if (st.length() == 0){
                JOptionPane.showMessageDialog(null, "É necessario inserir uma nota!", "Erro!", 0);
            } else nota2 = Double.parseDouble(st);
        } while (st == null || st.length() == 0);
            
        do {
            st = JOptionPane.showInputDialog(null, "Informe sua terceira nota");
            if (st == null){
                JOptionPane.showMessageDialog(null, "Saindo...");
                System.exit(0);
            } else if (st.length() == 0){
                JOptionPane.showMessageDialog(null, "É necessario inserir uma nota!", "Erro!", 0);
            } else nota3 = Double.parseDouble(st);
        } while (st == null || st.length() == 0);
        
        media = (nota1 + nota2 + nota3)/3;
        
        if (media < 7) st = "Insuficiente";
        else if (media < 8) st = "Suficiente";
        else if (media < 9.5) st = "Bom";
        else st = "Exelente";

        JOptionPane.showMessageDialog(null, String.format("Média obtida: %.1f \nConceito: %s", media, st), "Resultado", JOptionPane.INFORMATION_MESSAGE);

    }
}
