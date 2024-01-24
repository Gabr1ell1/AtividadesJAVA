import javax.swing.JOptionPane;
public class verts {
  
    public static void main(String[] args) {
        
        int[] vetorOriginal = new int[10];
        
        System.out.println("Digite 10 elementos do vetor:");
        for (int i = 0; i < 10; i++) {
            vetorOriginal[i] = JOptionPane.nextInt();
        }
        
        int[] vetorInverso = new int[10];
        for (int i = 0; i < 10; i++) {
            vetorInverso[i] = vetorOriginal[9 - i];
        }
        
        System.out.println("Vetor original:");
        for (int num : vetorOriginal) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nVetor inverso:");
        for (int num : vetorInverso) {
            System.out.print(num + " ");
        }
    }
}

