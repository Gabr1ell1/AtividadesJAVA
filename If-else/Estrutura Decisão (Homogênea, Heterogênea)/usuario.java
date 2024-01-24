import javax.swing.JOptionPane;

public class usuario 
{
  public static void main(String []arg)
  {

      int numero;
      numero = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada: "));
  
  switch(numero)
  {
      case 1:
          JOptionPane.showMessageDialog(null,"BigMac ");
          break;
      case 2:
          JOptionPane.showMessageDialog(null,"Quarteirão ");
          break;
      case 3:
          JOptionPane.showMessageDialog(null,"MacChicken");
          break;
      case 4:
          JOptionPane.showMessageDialog(null,"Cheddar MacMelt");
          break;
      case 5:
          JOptionPane.showMessageDialog(null,"MacMax");
          break;        
      default:
          JOptionPane.showMessageDialog(null,"Opção inválida");
  }

  }  
}
