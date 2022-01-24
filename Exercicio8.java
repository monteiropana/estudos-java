import java.util.Scanner;
public class Exercicio8 {
    public static void main(String[] args){
        double valor;
        float horasTrabalhadas;
        Scanner scan = new Scanner (System.in);
        System.out.println("quanto voce ganha por hora?");
        valor = scan.nextDouble();

        System.out.println("quantas horas voce trabalha no mês?");
        horasTrabalhadas = scan.nextFloat();

        System.out.println(" seu salário no mês é : " + (valor * horasTrabalhadas));
    }
    
}
