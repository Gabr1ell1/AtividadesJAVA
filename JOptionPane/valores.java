import javax.swing.JOptionPane;

public class valores 
{
  public static void main(String [] args)
  {
      double IPI, CP, VUP,QP, cp, vup, qp, valor_total;
    
    IPI = Double.parseDouble(JOptionPane.showInputDialog("Digite a porcentagem de IPI: "));
    
    CP = Double.parseDouble(JOptionPane.showInputDialog("Digite o código da peça: "));
    //o valor e quantidade(1)
    VUP = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitário da peça: "));
    QP = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de peças: "));
   
    cp = Double.parseDouble(JOptionPane.showInputDialog("Digite o codigo da peça:(2) "));
     //valor e quantidade(2)
    vup = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitario da peça:(2) "));
    qp= Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de peças: (2) "));
         valor_total = (VUP * QP + vup * qp)*(IPI/100 + 1);
    
    JOptionPane.showMessageDialog(null, "O valor total a ser pago é: " +valor_total);

      
      
      
  }





    
}
