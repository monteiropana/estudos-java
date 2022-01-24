import java.util.Scanner;
public class Exercicio11 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int numeroInteiro;
        int numeroInteiro2;
        float numeroReal;

        System.out.println(" Digite o primeiro numero inteiro ");
        numeroInteiro = scan.nextInt();
        System.out.println(" Digite o segundo numero inteiro ");
        numeroInteiro2 = scan.nextInt();
        System.out.println(" Digite 1 numero real ");
        numeroReal = scan.nextFloat();

        System.out.println(" O produto do dobro do primeiro com metade do segundo é: " + (numeroInteiro * 2) * ( numeroInteiro2/2 )) ;
        System.out.println(" A soma do triplo do primeiro com o terceiro é "+ (numeroInteiro * 3 + numeroReal));
        System.out.println(" O terceiro numero elevado ao cubo é " + (numeroReal * numeroReal * numeroReal));
    }

    
}
