import javax.swing.JOptionPane;

public class exemplo 
{
  public static void main(String []args)
   {  
    double nun1, nun2, media;
    
    nun1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua primeira nota: "));
    nun2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua segunda nota: "));        
    media = (nun1 + nun2 )/2;
    
    if (media>=5)
    {
        JOptionPane.showMessageDialog(null,"O aluno foi aprovado com a média: " +media);
    }
    else 
    {
       JOptionPane.showMessageDialog(null, "O aluno foi reprovado com a media:  " +media);
    }
    
  }
}
