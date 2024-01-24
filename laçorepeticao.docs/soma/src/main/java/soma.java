import java.util.Scanner;
public class soma 
{
    public static void main (String [] args)
  {
        
         
        Scanner input = new Scanner(System.in);
        int in, f, soma=0;
        
    System.out.println("Digite um valor inicial: ");
    in = input.nextInt();
    
    System.out.println("Digite o valor final: ");
    f = input.nextInt();
    
    if (in>f){
        System.out.println("Valor invertido: ");
        for(int i=f;i<=in;i++){
            if(i % 2 != 0){
                soma += i;
            }
                
        }
        System.out.println("A soma dos números impares é: "+soma);
    }
    
    else {
        for(int i=in; i<=f; i++){
            if (i % 2 != 0)
           soma += i;
        }
        System.out.println("A soma dos numeros ímpares é: " +soma);
        
        
        
    }        
  }
}