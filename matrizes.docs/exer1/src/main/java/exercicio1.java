import java.util.Scanner;

public class exercicio1 
{
     public static void main(String[] args)
  {
         
         Scanner ler = new Scanner(System.in);
         int [][] ma = new int [4][5];
         int l, c, somaPar=0, somaInp=0;
         double media1=0, media2=0;
         
         for(l=0;l<4;l++){
             for(c=0;c<5;c++){
                 System.out.println("Digite um número:");
                 ma[l][c]= ler.nextInt();
             }
         }
    
     System.out.println("Os números pares são: ");
     for(l=0;l<4;l++)
     {
         for(c=0;c<5;c++)
         {
            if(ma[l][c] % 2 == 0)
             {
                  System.out.print("["+ma[l][c]+"]");      
             }
            else{
                System.out.print("-");
            }
           
         }
         
         System.out.print("\n");
     }
     
     
     
     
     System.out.println("Os números ímpares são: ");
     for(l=0;l<4;l++)
     {
             for(c=0;c<5;c++)
             {
                if(ma[l][c] % 2 != 0)
                {
                   System.out.print("["+ma[l][c]+"}");
                }
                else{
                    System.out.print("-");
                }
             }
        System.out.print("\n");     
     }     
       
     
     
     
     
     
     
     
     
     
     
     
  }
}