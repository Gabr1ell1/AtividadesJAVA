import javax.swing.JOptionPane;

public class desafio {
    public static void main(String[] args){
        
        String [] nomes = new String [10];
        double [][] notas = new double [10][3];
        double [] med = new double[10];
        
        int somali = 0;
        int l,c, quant=3;
        double result;
        
        
        System.out.println("Nomes: ");
        //atribuição de valores
        for(l=0;l<10;l++){
            nomes[l]= JOptionPane.showInputDialog("Digite seu nome: ");
        }
        //apresentação dos nomes
        for(l=0;l<10;l++){
        System.out.println(nomes[l]);
        }
    
         System.out.println("Notas:");        
        //atribuindo as notas
        for(l=0;l<10;l++){
            for(c=0;c<3;c++){             
               notas[l][c]=Double.parseDouble(JOptionPane.showInputDialog("Digite sua nota: "));        
            }
        }
         //apresentando as notas
        for(l=0;l<10;l++){
            for(c=0;c<3;c++){                
              System.out.print("["+notas[l][c]+"]");                  
        }
            System.out.print("\n");
        }  
        
        
        //somando cada linha e as mandando para um vetor
        for(l=0;l<10;l++){
            for(c=0;c<10;c++){
            somali += notas[l][c];    
            }   
            med[l]= somali / quant;
        }
        
      if(med[l]>=7.0){
            System.out.println(+med[l]);
        } else{
            System.out.println(+med[l]+"*");
        }
        
      for(l=0;l<10;l++){
            for(c=0;c<10;c++){
        System.out.println(nomes[l]+"["+notas[l][c]+"]"+med[l]);
            }
        }
        
       
       

        
        
        
}
}