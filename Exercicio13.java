import java.util.Scanner;
public class Exercicio13{
    public static void main(String[] args){
        double valorHoras;
        double horasTrabalhadas;
        double salarioBruto;
        double salarioLiquido;
        double inss = 0.08;
        double sindicato = 0.05;
        double ir = 0.11;
        double descontos;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual é o valor da hora trabalhada? ");
        valorHoras = scan.nextDouble();

        System.out.println ("Quantas horas trabalha ao mes: ");
        horasTrabalhadas = scan.nextDouble();

        salarioBruto = valorHoras * horasTrabalhadas;
        System.out.println(" O valor bruto é :" + salarioBruto);
        
        System.out.println(" O valor pago ao INSS foi de : " + (salarioBruto * inss));
        System.out.println(" O valor pago ao SINDICATO foi de : " + (salarioBruto * sindicato));

        descontos = (salarioBruto * inss) + (salarioBruto * sindicato) + (salarioBruto * ir);

        salarioLiquido = salarioBruto - descontos;
        System.out.println("o salario liquido é: " + salarioLiquido);
        
    }




}
