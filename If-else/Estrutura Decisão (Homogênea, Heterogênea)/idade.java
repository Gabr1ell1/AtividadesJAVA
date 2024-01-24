import javax.swing.JOptionPane;

public class idade 
{
  public static void main(String []args)
  {
    int idade;
    
    idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
      
      
     if ((idade>=5)&& (idade<=7))
     {
      JOptionPane.showMessageDialog(null,"Infantil A");
     }
     else if ((idade>=8) && (idade<=10)) 
     {
         JOptionPane.showMessageDialog(null,"Infantil B");
     }
     else if ((idade>=11) && (idade<=13)) 
     {
         JOptionPane.showMessageDialog(null, "Juvenil A");
     }
     else if ((idade>=14) && (idade<=17))
     {
         JOptionPane.showMessageDialog(null, "Juvenil B");
     }
     else if (idade>=18)
     {
         JOptionPane.showMessageDialog(null, "Senior");
     }
  }    
}
