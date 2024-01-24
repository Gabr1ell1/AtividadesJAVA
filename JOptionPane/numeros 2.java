import javax.swing.JOptionPane;

public class numeros 
{
  public static void main(String [] args)
  {    
    int numero= 0, antecessor = 0, sucessor = 0;
    
    numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
    sucessor = numero +1;
    antecessor = numero - 1;
    
    JOptionPane.showMessageDialog(null,"O número digitado foi: " +numero);
    JOptionPane.showMessageDialog(null,"O sucessor desse numero é: " +sucessor);
    JOptionPane.showMessageDialog(null,"E o antecessor é: " +antecessor);
      
      }
}  
