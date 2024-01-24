import javax.swing.JOptionPane;

 public class multas {
     public static void main(String []args)
     {
         double  peso, PE, vm,
         multa = 4,
         Quant = 50;
         
     peso = Double.parseDouble(JOptionPane.showInputDialog("Digite quantos kilos pescou: "));
         
         
     if (peso>50)
     {
         PE = peso - 50;
         vm = PE * 4;
        JOptionPane.showMessageDialog(null,"O valor da Multa a ser paga é " +vm);
     }
     else 
     {
        JOptionPane.showMessageDialog(null, "Sem multa");    
     }
     
     
     }
    
}
