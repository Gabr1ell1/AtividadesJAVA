import javax.swing.JOptionPane;

public class salarios {
     public static void main(String []args){
         
         int i;
         double salM= 1000.00;
         double[] salarios= new double[10];
         
         for(i=0;i<salarios.length;i++)
         {
             salarios[i]= (i+1)*salM;
         }
         
         for(i=0;i<salarios.length;i++)
         {
             System.out.println((i+1)+ "Salários mínimo = " +salarios[i] +"\n");
         }
         
     }    
}
