import javax.swing.JOptionPane;

public class NotasAlunos 
{
    public static void main(String []args)
    {//começo do main
       
        String nome;
        double nota1, nota2;
        
        
        nome =  JOptionPane.showInputDialog("Digite seu nome: ");
        nota1 = lerNotas("Digite a primeira nota: ");
        nota2 = lerNotas("Digite sua segunda nota: ");
       
        double media = calcularMedia(nota1, nota2);
        JOptionPane.showMessageDialog(null, "Sua média " +nome+ " é " +media);
        
        
        if (media<7){
            JOptionPane.showMessageDialog(null, "Aluno reprovado");
        }
        else{
             JOptionPane.showMessageDialog(null, "Aluno aprovado!! ");
        }
        
    }//fim do main
    
    static double lerNotas(String ler)
    {
        return Double.parseDouble(JOptionPane.showInputDialog(ler));    
    }
    
    static double calcularMedia(double nota1, double nota2)
    {
        return (nota1 + nota2)/2;
        
    }
}
