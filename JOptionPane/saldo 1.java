import javax.swing.JOptionPane;

public class saldo 
{
   public static void main(String [] args) 
 {
      double saldo, Vr, sf;
       
      saldo = Integer.parseInt(JOptionPane.showInputDialog("Digite o saldo:"));
      Vr = (saldo*(1+1/100)); //valor do reajuste
      sf = saldo + Vr;
      
      JOptionPane.showMessageDialog(null, "o valor do saldo reajustado é: " +sf);
      
     
     
  }
}
