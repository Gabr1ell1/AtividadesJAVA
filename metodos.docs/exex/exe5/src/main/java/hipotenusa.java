import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class hipotenusa 
{
    public static void main(String []args)
    {
        double altura, base;
        DecimalFormat formato = new DecimalFormat("00.00");
    
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triangulo: "));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do triangulo: "));
        
        double hipotenusa = calcHipotenusa(base,altura);
        JOptionPane.showMessageDialog(null, "O resultado do calculo foi: [" +formato.format(hipotenusa)+ "]");
    }
    static double calcHipotenusa(double b, double alt)
    {
        double result = Math.sqrt(b*b + alt*alt);
        return result;
   
    }
}
