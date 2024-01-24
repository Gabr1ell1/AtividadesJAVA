import javax.swing.JOptionPane;

public class palavraVogais {
   public static void main(String []args)
   {
       
   String palavra;
   int i;
   
   palavra= JOptionPane.showInputDialog("DIGITE UMA PALAVRA: ");
   System.out.println("\n vogais da palavra: \t"+ palavra+"\n");
   //a função toCharArray() separa os caracteres da palavra digitada.
   char[] vetor = palavra.toCharArray();
   int tamanho= vetor.length;
   
   for(i=0; i<tamanho;i++){
       if(vetor[i] =='a' || vetor[i] == 'e' || vetor[i] == 'i' || vetor[i]=='o' || vetor[i] =='u'){
   }
       System.out.println( vetor[i] +"");
   }
   }
       
       
}
