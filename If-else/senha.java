import javax.swing.JOptionPane;

public class senha 
{
   public static void main(String [] args)
   {
       int senha;
       
       senha = Integer.parseInt(JOptionPane.showInputDialog("Digite a senha: "));
        
     if (senha==123){
       JOptionPane.showMessageDialog(null,"Senha válida: " );
       }
     else {
         JOptionPane.showMessageDialog(null,"Senha não válida");
     }
       
     }    
}
