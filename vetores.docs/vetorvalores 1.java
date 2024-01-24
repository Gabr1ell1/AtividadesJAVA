import java.util.Scanner;
public class vetorvalores {
    
    public static void main(String []args){ 
        Scanner ler = new Scanner(System.in);
        int[] nun = new int[10];
        int i;
        
        for(i=0; i<10;i++){
            System.out.println("Digite um número: ");
            nun[i]=ler.nextInt();
           
        }
        System.out.println();
        
        //apresentação
        for(i=0; i<10;i++){
            System.out.println(nun[i]);
        }
               
    }
}
