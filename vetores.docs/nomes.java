import javax.swing.JOptionPane;

public class nomes {
   public static void main(String []args){
       
       String[] nomes = new String[10];
       int i;
       
       for(i=0;i<10;i++)
       {
           nomes[i]= JOptionPane.showInputDialog("Digite o " +(i+1)+ "nome:");         
       }
       
       for(i=0;i<10;i++)
       {
         System.out.println((i+1)+ "nome" +nomes[i]);
       }
   }    
}
