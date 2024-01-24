import javax.swing.JOptionPane;

public class Calcs 
{
    public static void main(String []args)
    {
        int numeros;
    
        while(true){
    numeros = Integer.parseInt(JOptionPane.showInputDialog(null, "1- Soma\n2- Subtração\n3- Divisão\n4- Multiplicação\n5- Resto da Divisão\n6- Dobro\n7-"
            + " Quadrado\n8- Cubo\n9- Raiz Quadrada\n0- Sair\n\n  Escolha um número referente a operação desejada: "));
        
    
    if(numeros == 0){
            JOptionPane.showMessageDialog(null,"Encerrado");
            break;
        }
        
         calculos(numeros);
        }
    }
    
    static void calculos(int calc){
        double result=0;
        double num1=0, num2=0;
        num1= Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número: "));
        
        
        if(calc<6){
        num2= Double.parseDouble(JOptionPane.showInputDialog(null, "Informe um número: "));
    }
        
        switch(calc)
        {
            case 1:
             result= num1 + num2;
             JOptionPane.showMessageDialog(null,"A soma é " +result);
             break;
             
            case 2:
             result= num1 - num2;
             JOptionPane.showMessageDialog(null,"A subtração é " +result);
             break;
             
            case 3:
             result= num1 / num2;
             JOptionPane.showMessageDialog(null,"A divisão é " +result);
             break;
             
            case 4:
             result= num1 * num2;
             JOptionPane.showMessageDialog(null,"A multiplicação é " +result);
             break;
             
            case 5:
             result= num1 % num2;
             JOptionPane.showMessageDialog(null,"O resto da divisão é " +result);
             break;
             
            case 6:
             result= num1 * 2;
             JOptionPane.showMessageDialog(null,"O dobro é " +result);
             break;
             
            case 7:
                //calculo do quadrado
             result= num1 * num1;
             JOptionPane.showMessageDialog(null,"O quadrado é " +result);
             break;
             
            case 8:
                //calculo do cubo
             result= num1 * num1 * num1;
             JOptionPane.showMessageDialog(null,"O cubo é " +result);
             break;
             
            case 9:
                //calculo da raiz
             result=  Math.sqrt(num1);
             JOptionPane.showMessageDialog(null,"A raiz quadrada é " +result);
             break;
             
        }
        
        
        
    }
    
}    