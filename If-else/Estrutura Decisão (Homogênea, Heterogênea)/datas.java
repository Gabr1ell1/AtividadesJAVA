import javax.swing.JOptionPane;

public class datas 
{
  public static void main(String [] args)
  {
      int d, m, a;
      int d2, m2, a2;
      
      d = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia:"));
      m = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes:"));
      a = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano:"));
      d2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2 dia:"));
      m2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2 mes:"));
      a2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2 ano:"));
      
      
      
      if ((d<d2)&&(m<m2)&&(a<a2))
      {
          JOptionPane.showMessageDialog(null, "a primeira data é." +d +m +a);
          JOptionPane.showMessageDialog(null, "a segunda data é." +d2 +m2 +a2);
          
      }
      else  if ((d>d2)||(d==d2) && (m>m2)||(m==m2)&& (a>a2)||(a==a2)) 
      {
          JOptionPane.showMessageDialog(null,"a segunda data é." +d2 +m2 +a2);
          JOptionPane.showMessageDialog(null, "A 1 data é." +d  +m  +a);
                   
      }
      
  
  }   
}
