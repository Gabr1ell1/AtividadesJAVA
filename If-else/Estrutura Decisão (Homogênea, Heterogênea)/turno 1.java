import javax.swing.JOptionPane;

public class turno 
{

    public static void main(String [] args)
    {
       double horario;
       
       horario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu horário:"));
       
       
    if ((horario>5)&& (horario<=12.59))
        {
        JOptionPane.showMessageDialog(null,"turno da manhã");
        }
    
    else 
        if ((horario>=13) && (horario<=20.59))
        {
        JOptionPane.showMessageDialog(null,"Turno da tarde");
        }
    else
        if ((horario>=21) || (horario<=04.59))
        {
        JOptionPane.showMessageDialog(null,"Turno da noite");
        }
        
    
       
        
        
        
    }
    
    
}
