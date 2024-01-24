import javax.swing.JOptionPane;

public class exemplo {
      public static void main(String []args){
      
          final int N_lin = 3, N_col = 3;//final para definir constante
          int[][] mat = new int[N_lin][N_col];
          int l, c;
          
          JOptionPane.showMessageDialog(null,"******* Cadastrando dados na metriz ******\n Entre com o valor em cada posição da matriz");
     //atribuição dos valores na matriz
     for(l = 0; l<N_lin;l++)
     {
         for(c = 0; c<N_col;c++){
             mat[l][c]= Integer.parseInt(JOptionPane.showInputDialog("valor da linha "+(l + 1)+" coluna "+(c + 1)+" ::"));
         }//fim do for da coluna 
     }//fim do for da linha
     
     JOptionPane.showMessageDialog(null,"******* Exibindo os dados da matriz ******");
     
     //exibição dos valores na matriz
     for(l = 0; l<N_lin;l++)
     {
         for(c = 0;c<N_col;c++){
             System.out.println(mat[l][c]+" ");
         }//fim do for da coluna
         System.out.println("\n");//para organizar as linhas
     }//fim do for da linha 
  }      
}
