import javax.swing.JOptionPane;

public class exemplo1 {
    public static void main(String []args){
        int a;
        digite();
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        dobro(a);
    }
    static void digite()
    {
        JOptionPane.showMessageDialog(null, "Digite um número: ");
    }

static void dobro(int a)
{
    int n = a;
  int d = n * 2;
  JOptionPane.showMessageDialog(null, "Dobro de " +a+ " é "+d);
}
}