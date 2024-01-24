import java.util.Scanner;

public class exercicio2 {
      public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in); 
        int [][] matriz = new int [5][3]; 
        int l, c,soma1=0,soma2=0,soma3=0,soma4=0,soma5=0, l1=0, l2=1,l3=2,l4=3,l5=4;
        
        //atribuindo valores
        for(l=0;l<5;l++)
        {
            for(c=0;c<3;c++)
            {
            System.out.println("Digite um número: ");
            matriz[l][c] = ler.nextInt();  
            }
        }
        System.out.println("\n");
        
         System.out.println("Matriz");
         //exibindo matriz
         for(l=0;l<5;l++)
        {
            for(c=0;c<3;c++)
            {
            System.out.print("["+matriz[l][c]+"]\t");  
            }
         System.out.print("\n");   
        }
        System.out.print("\n");
         
         
        //soma
        System.out.println("A soma dos números de cada linha da matriz são: ");
        
           for(c=0;c<3;c++){
               soma1 += matriz[l1][c];
           }
             System.out.print("soma da primeira linha ["+soma1+"]\n");
        
         
           for(c=0;c<3;c++){
               soma2 += matriz[l2][c];
           }
             System.out.print("soma da segunda linha ["+soma2+"]\n");
       
           for(c=0;c<3;c++){
               soma3 += matriz[l3][c];
           }
             System.out.print("soma da terceira linha ["+soma3+"]\n");
        
        
           for(c=0;c<3;c++){
               soma4 += matriz[l4][c];
           }
             System.out.print("soma da quarta linha ["+soma4+"]\n");
        
         
           for(c=0;c<3;c++){
               soma5 += matriz[l5][c];
           }
             System.out.print("soma da quinta linha ["+soma5+"]\n"
                     + "");
        
    }    
}
