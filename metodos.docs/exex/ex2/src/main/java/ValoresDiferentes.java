import javax.swing.JOptionPane;

public class ValoresDiferentes 
{
      public static void main(String []args)
      {//corpo main
          double valor1, valor2;
          
          valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu 1° valor: "));
          valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu 2° valor: "));
          
          
          diferenca(valor1,valor2);
         //fim do main
      }    
    static void diferenca(double valor1,double valor2)
    {
       if(valor1 > valor2){
           //calculo da diferença
              double dv = valor1 - valor2;
              JOptionPane.showMessageDialog(null, "O primeiro Valor é maior que o segundo.\nSua diferença é [" +dv+ "]");
          }
          else if(valor2>valor1){
              double dv = valor2 - valor1;
              JOptionPane.showMessageDialog(null, "O segundo Valor é maior que o primeiro.\nSua diferença é [" +dv+ "]");
          }
          else{
              JOptionPane.showMessageDialog(null, "Os dois valores são iguais");
          }
   //fim do metodo diferenca
    }
}
