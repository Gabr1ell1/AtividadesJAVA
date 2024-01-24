import javax.swing.JOptionPane;
        
public class clase2 
{
     public static void main(String[] args){
         int a = 0, b = 0, c = 0, d = 0, r = 0;
         a = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1 numero:"));
         b = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2 numero:"));
         c = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3 numero:"));    
         d = Integer.parseInt(JOptionPane.showInputDialog("digite o 4 numero:"));
         r = (a * b) + (a * c ) + (a *d);
         JOptionPane.showMessageDialog(null, "o resultado é:" +r);
                 
                 
                 
                 
     }
     
    
    
    
    
    
}
