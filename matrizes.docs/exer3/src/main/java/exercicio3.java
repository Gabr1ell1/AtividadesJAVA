import javax.swing.JOptionPane;

public class exercicio3 
{
     public static void main(String[] args)
    {
         String [][] nomes = new String[10][2];
         int l=0,c=0;
         double valor1=0, valor2=0;
         
         for(l=0;l<10;l++)
         {
             
                nomes[l][c]=  JOptionPane.showInputDialog("Informe o nome do produto:");
                nomes[l][c+1]= JOptionPane.showInputDialog("Informe o valor do produto: ");
                
    }
        System.out.println("Matriz: ");
         //exibindo a matriz
          for(l=0;l<10;l++)
         {
                  System.out.print("["+nomes[l][c]+"]\t");
                   System.out.print("["+nomes[l][c+1]+"]\n");
             }
             System.out.println("\n");
         
         
          valor1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor limite: "));
        
         
         System.out.println("Os produtos com o preço abaixo do seu valor limite ["+valor1+"] são: ");
         for(l=0;l<10;l++)
         {
             valor2 = Double.parseDouble(nomes[l][c+1]);
             if(valor2<=valor1){
                  System.out.print("["+nomes[l][c]+"]\t");
                   System.out.print("["+nomes[l][c+1]+"]\n");
             
             }
             System.out.println("\n");}
    }
}

