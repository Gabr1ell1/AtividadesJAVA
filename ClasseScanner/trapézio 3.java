import java.util.Scanner;

public class trapézio {
    
   public static void main(String [] args)
   {
      Scanner ler= new Scanner(System.in); 
       
       double BM, BMN, ALT, R;
       System.out.println("Digite a base maior do trapézio");
         BM = ler.nextDouble();
       System.out.println("Digite a base menor do trapézio");
         BMN = ler.nextDouble();
       System.out.println("Digite a altura do trapézio ");
         ALT = ler.nextDouble();
         
         R = ((BM + BMN) * ALT) /2;
       System.out.println("A Área do trapézio é:" +R);
       
       
       
   }        
}
