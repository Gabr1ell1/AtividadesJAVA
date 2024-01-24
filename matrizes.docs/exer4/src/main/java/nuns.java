import java.util.Scanner;
public class nuns {
    public static void main(String []args){
        Scanner ler = new Scanner(System.in);
        
        int [][] nun = new int [4][5];
        
        int l, c, quant1=0, quant2=0, soma1=0, soma2=0;
        double media1, media2;
        
        
        for(l=0;l<4;l++){
            for(c=0;c<5;c++){
                System.out.println("Digite um número: ");
                nun[l][c]=ler.nextInt();
            }
        }
         System.out.println("\n");
        //imprimindo a matriz 
         System.out.println("Matriz: ");
        for(l=0;l<4;l++){
            for(c=0;c<5;c++){
                System.out.print("["+nun[l][c]+"]\t");
            }
             System.out.println("\n");
        }
          System.out.println("\n");
        //quantidade e soma
      for(l=0;l<4;l++){
            for(c=0;c<5;c++){
                if(nun[l][c] % 2 == 0){
                    quant1= quant1 +1;
                    soma1 += nun[l][c];
                }
                else{
                    quant2 = quant2 +1;
                    soma2 += nun[l][c];
                }
                
            }
        }
        
      media1 = soma1/quant1;
      media2 = soma2/quant2;
      
      System.out.println("A quantidade de números pares: ["+quant1+"]");
      System.out.println("A quantidade de números ímpares: ["+quant2+"]");
      System.out.println("A SOMA de números pares: ["+soma1+"]");
      System.out.println("A SOMA de números ímpares: ["+soma2+"]");
      System.out.println("A média dos números pares são: "+media1);
      System.out.println("A média dos números pares: "+media2);
      
        
    }
    
}
//concluído