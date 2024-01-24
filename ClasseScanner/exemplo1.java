import java.util.Scanner;
        
public class exemplo1 {
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double bs, al, ar;
        
        System.out.println("Digite a base do retangulo:");
        bs = input.nextDouble();
        System.out.println("Digite a altura do retangulo");
        al = input.nextDouble();
        ar = bs * al;
        System.out.println("A area do retangulo é:" +ar);
        
    }        
    
}
