import java.util.Scanner;

public class exex{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] a = new int[10];
        int[] b = new int[10];
        
        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++) {
            a[i] = scanner.nextInt();
        }
        
       
        for (int i = 0; i < 10; i++) {
            b[i] = a[9 - i];
        }
        //ordem a é a normal, ordem b é a inversa
        
        System.out.println("\nOrdem a:");
        for (int i = 0; i < 10; i++) {
            System.out.print(a[i] + " ");
        }
        
        System.out.println("\nOrdem b:");
        for (int i = 0; i < 10; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
