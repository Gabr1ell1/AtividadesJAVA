import java.util.Scanner;

public class exemplo2 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double SL, SB, VH, HT, ND, BN;
        
        BN = 300;
        System.out.println("informe o valor por hora trabalhada:");
        VH = input.nextDouble();
        System.out.println("informe a quantidade de horas trabalhadas:");
        HT = input.nextDouble();
        System.out.println("informe a quantidades de dependentes:");
        ND = input.nextDouble();
        SB = VH * HT;
        SL = SB + BN * ND;
        System.out.println("O VALOR DO SEU SALARIO BRUTO É DE:" +SB);  
        System.out.println("O VLO DO SEU SALARIO LIQUIDO É DE:" +SL);  
        
    }        
    
    
}
