import java.util.Scanner;

public class espetaculo {
    
    public static void main(String[] args){
    
    Scanner ler = new Scanner(System.in);
       double R, ce, pc;
    
      System.out.println("Digite o cuto do espetáculo:");
      ce = ler.nextDouble();
      System.out.println("digite o preço do convite:");
      pc = ler.nextDouble();
      R = ce / pc;
      System.out.println("a quantidades de covintes vendidos necessários são:" +R );
   
   
   
   
   
   
   
}
}
