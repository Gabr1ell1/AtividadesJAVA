import java.util.Scanner;

public class degraus 
{

    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        double R, d, a;
        
        System.out.println("Digite a altura do degrau:(em metro)");
        d = ler.nextDouble();
        System.out.println("Em qual altura voce deseja alcançar:(em metro)");
        a = ler.nextDouble();
        R = a/d;
        System.out.println("Voce precisa subir:" +R);
    }
  
  
    
}
