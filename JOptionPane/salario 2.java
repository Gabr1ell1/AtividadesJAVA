import javax.swing.JOptionPane;

public class salario 
{

  public static void main (String [] args)
  { 
     float salario_usuario, r;
     float SM = 100000;
     
     salario_usuario = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu salário: "));
     r = salario_usuario / SM;
     
     JOptionPane.showMessageDialog(null,"o resulatdo é:" +r);
     
      
  }
}
    
    
    
    
    
    

