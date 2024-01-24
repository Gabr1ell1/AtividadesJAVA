import javax.swing.JOptionPane;

public class exemplo2 {
     public static void main(String []args)
     {
      int t;
      String p;
      digite();//metodo para digitar
      p = JOptionPane.showInputDialog("Digite uma palavra qualquer: ");
      t = tamanho(p);//metodo para o tamanho
      JOptionPane.showMessageDialog(null, p+" possui " +t+ " caracteres");

     }//main fianl    
     //os metodos ficam dentro da class.

static void digite()
{
JOptionPane.showMessageDialog(null, "Digite uma palavra");
}
static int tamanho(String x)
{
    return x.length();//metoddo
}

}//classe