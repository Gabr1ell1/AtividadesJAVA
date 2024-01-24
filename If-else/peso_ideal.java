import javax.swing.JOptionPane;

public class peso_ideal {
    public static void main(String [] args){
        
    
    double altura, peso_idealh, peso_idealf;
    String nome, sexo;
    
    nome = JOptionPane.showInputDialog("Digite o seu Nome: ");
    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura: "));
    sexo = JOptionPane.showInputDialog("Seu sexo: Digite (M) para masculino, ou (F) para feminino: ");
    
   
    
    
            
    if (sexo=="M"){
        
         peso_idealh = (72.7*altura)-58;
         JOptionPane.showMessageDialog(null, "Seu peso ideal:"  +peso_idealh);
    }
    else{
        peso_idealf = (62.1*altura)-44.7;
        JOptionPane.showMessageDialog(null, "Seu peso ideal:"  +peso_idealf);
        
    }
  
    }  
}
