import javax.swing.JOptionPane;

public class valores {
    public static void main(String []args)
  {
    int valor;
    
    valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor: "));
    if (valor>0)
        {
            JOptionPane.showMessageDialog(null, "O valor é positivo.");
        }
    else
            {
             JOptionPane.showMessageDialog(null, "o valor é negativo.");   
            }
  }
    
}
