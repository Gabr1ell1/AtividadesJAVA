import java.util.Scanner;
        
public class vendas {
    
       public static void main(String[] args){
           
           Scanner ler = new Scanner(System.in);
           String N;
           double S, V, C, SF;
           
           System.out.println("Digite o seu nome:");
           N = ler.nextLine();
           
           System.out.println("Digite o seu salário fixo:");
           S = ler.nextDouble();
           
           System.out.println("Digite o valor de suas vendas:");
           V = ler.nextDouble();
           
           C = V * 4/ 100;
           SF = C + S;
           System.out.println("Seu nome é: " +N);
           System.out.println("A sua comissao é: " +C);
           System.out.println("O seu salario fixo é: " +SF);
           
           
           
           
       }
    
}

