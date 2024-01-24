import javax.swing.JOptionPane;

public class aluno 
{
   public static void main(String []args)
   {
   
      float n1, n2, n3, n4, media;
      
      n1= Float.parseFloat(JOptionPane.showInputDialog("Digite a 1 nota:"));
      n2= Float.parseFloat(JOptionPane.showInputDialog("Digite a 2 nota:"));
      n3= Float.parseFloat(JOptionPane.showInputDialog("Digite a 3 nota:"));
      n4= Float.parseFloat(JOptionPane.showInputDialog("Digite a 4 nota:"));
       media = ((n1+n2+n3+n4) /4);
       
        if (media>=9)
        {
        JOptionPane.showMessageDialog(null,"A . Aprovado." +media);
        }
    
    else if ((media>=7) && (media<9))
        {
        JOptionPane.showMessageDialog(null,"B. Aprovado." +media);
        }
        
    else if ((media>=5) && (media<7))
        {
        JOptionPane.showMessageDialog(null,"C. Aprovado." +media);
        }   
       
    else if ((media>=2.5) && (media<5))
    {
        JOptionPane.showMessageDialog(null,"D. Reprovado." +media);
    }
    
    else if (media<2.5)
    {
        JOptionPane.showMessageDialog(null,"E. Reprovado." +media);
    }
  }
}
