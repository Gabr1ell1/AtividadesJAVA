import javax.swing.JOptionPane;

public class maioridade 
{
 public static void main(String []args)
 {
     int ano_nascimento;
     
     ano_nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento: "));
     
     if (ano_nascimento<=2005)
     {
       JOptionPane.showMessageDialog(null, "Voce atigiu a maioridade.");
     }
     else
     {
         JOptionPane.showMessageDialog(null, "Voce não pode sentar na mesa dos adultos :( ");
     }
     
 }    
    
}
