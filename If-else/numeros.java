import javax.swing.JOptionPane;

public class numeros {
    public static void main(String[] args)
    {
       double nun1, nun2, soma;
       nun1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número: "));
       nun2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número: "));
       soma = nun1+nun2;
       
       if (soma>25)
       {
           JOptionPane.showMessageDialog(null,"Soma maior que 25");
       }
        
        
        
    }
    
}
