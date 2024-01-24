import javax.swing.JOptionPane;

public class idade {
    public static void main(String [] args) {
        
        int A = 0, M = 0, D = 0;
        int DA = 365;
        int DM = 30;
        int dias;
        
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite os anos:"));
        M = Integer.parseInt(JOptionPane.showInputDialog("Digite os meses:"));
        D = Integer.parseInt (JOptionPane.showInputDialog("digite os dias:"));
        dias = (A * DA ) + (M * DM ) + D; 
        
        JOptionPane.showMessageDialog(null, "Os dias sao:" +dias);
        
        
    }
}
