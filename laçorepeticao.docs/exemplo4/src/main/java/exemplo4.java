
public class exemplo4 {
      public static void main(String[] args){
          char letras[] = {'a', 'b', 'c', 'd','e'};
          int i;
          for(i=0; i<letras.length; i++){
              if(letras[i] == 'c'){
                  break;
              }
          }
        System.out.println("Último índice: " +i);
     }    
}
