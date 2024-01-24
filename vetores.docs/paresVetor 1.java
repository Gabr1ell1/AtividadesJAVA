import java.util.Scanner;
public class paresVetor {
    public static void main(String []args){
        
        Scanner ler = new Scanner(System.in);
      
        int[] vetor = new int[15];
        int i;
        
    for(i=0; i<15; i++)
    {
        System.out.println("Digite um número: ");
        vetor[i] = ler.nextInt();
    }
        for(i=0; i<15; i++)
        {
           if(vetor [i] % 2 == 0)
           {
               System.out.println("Os números pares são: " +vetor[i]);
           }   
            
        }
    }
}

