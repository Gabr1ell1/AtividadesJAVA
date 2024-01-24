import java.util.Scanner;
  
public class conversao 
{
    
    public static void main(String[] args)
    {
        Scanner ler = new Scanner(System.in);
        double R, d, ma, le, r, v1, v2,v3 ;
        d = 1.80;
        ma = 2.00;
        le = 1.57;
                
        System.out.println("Quanto voce tem em reais ao total:");
         R = ler.nextDouble();
         
        System.out.println("Quanto voce quer converter em dolár:");
         R = ler.nextDouble();
         v1 = R / d;
         System.out.println("Voce terá em dolár. " +v1);
         
         System.out.println("Quanto voce quer converter em marco alemão:");
         R = ler.nextDouble();
         v2 = R / ma;
         System.out.println("Voce terá em marco alemão. " +v2);
         
         System.out.println("Quanto voce quer converter em libra esterlina:");
         R = ler.nextDouble();
         v3 = R / le;
         System.out.println("Voce terá em libra esterlina. " +v3);
        
    }    
}
