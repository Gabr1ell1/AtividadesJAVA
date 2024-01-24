import javax.swing.JOptionPane;  

public class medias {
    public static void main(String [] args) 
    {
        int A = 0, B = 0, C = 0, R;
        int a = 0, b = 0, c = 0, r, SM, Mm;
        
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero:"));
        R = (A + B + C) /3;
        JOptionPane.showMessageDialog(null, "A Primeira média é:" +R);
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro numero:"));
        r = (a + b + c) /3;
        JOptionPane.showMessageDialog(null, "A Segunda média é:" +r);
        
        
        SM = R + r;
        JOptionPane.showMessageDialog(null, "A  soma das média é:" +SM);
        Mm = (R + r) / 2;
        JOptionPane.showMessageDialog(null, "A média da média é:" +Mm);
        
    }
}
