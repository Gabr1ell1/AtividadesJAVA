import javax.swing.JOptionPane;

public class triangulo 
{
    public static void main(String []args)
    {
        int A, B, C;
        
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1 valor"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2 valor"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3 valor"));
        
        if ((A + B>C)&&(A+C>B) && (B +C>A))
        {
            if ((A == B) && (A == C))
               JOptionPane.showMessageDialog(null, "É um triangulo Equilátero");
           
           else if ((A == B)||(A == C)||(B == C))
                JOptionPane.showMessageDialog(null, "É um triangulo Isósceles");
           
           else 
                   JOptionPane.showMessageDialog(null, "É um triangulo Escaleno");
        }
        else
            JOptionPane.showMessageDialog(null, "Não é um triangulo");
        
    }
}
