import javax.swing.JOptionPane;

        
public class massa_corporal 
{
   public static void main(String [] args)
   {
         float peso, alt, imc;
         
         peso = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu peso: "));
         alt = Float.parseFloat(JOptionPane.showInputDialog("Digite a sua altura: "));
         imc = peso/(alt*alt);
         
       if (imc <18)
       {
         JOptionPane.showMessageDialog(null,"Magreza");
       }
       
       else if ((imc >=18.0) && (imc<=24.9))
       {
         JOptionPane.showMessageDialog(null,"Saudavel");
       }
           
       else if ((imc >=25.0) && (imc<=29.9))
       {
         JOptionPane.showMessageDialog(null,"Sobrepeso");
       }
       
       else if (imc>=30.0)
       {
         JOptionPane.showMessageDialog(null,"obesidade");
       }
       
   }
    
}
