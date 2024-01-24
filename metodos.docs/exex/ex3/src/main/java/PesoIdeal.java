import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class PesoIdeal 
{
    public static void main(String []args)
    {
        String sexo;
        double altura;
        DecimalFormat formato = new DecimalFormat("00.0");
       
        sexo = JOptionPane.showInputDialog("Informe seu sexo: (feminino) ou (masculino)");
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: Ex: 1.78"));
        
        double peso = CalcpesoIdeal(altura, sexo);
      
        JOptionPane.showMessageDialog(null,"Seu peso ideal é \n" + formato.format(peso)+ "Kg");
          
    }
    static double CalcpesoIdeal(double alt, String sex){
        double peso = 0;
        
        if(sex.equals ("masculino"))
        {
          peso = (72.7*alt)-58;
          
        }
        else
            if(sex.equals ("feminino")){
                peso = (62.1*alt)-44.7;
                }
            else{
                
               JOptionPane.showMessageDialog(null, "valor Digitado inválido: Digite (feminino) ou (masculino)!");
            }
        return peso;
    }

}
