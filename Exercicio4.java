import java.util.Scanner;

public class Exercicio4 {
    public static void main(String []args){
        Scanner scan = new Scanner (System.in);

        int nota1;
        int nota2;
        int nota3;
        int nota4;

        System.out.println("digite a nota 1 ");
        nota1 = scan.nextInt();
        System.out.println("digite a nota 2 ");
        nota2 = scan.nextInt();
        System.out.println(" digite a nota 3 ");
        nota3 = scan.nextInt();
        System.out.println(" digite a nota 4 ");
        nota4 = scan.nextInt();
        System.out.println(" qual a media da soma das notas ? : " + ((nota1 + nota2 + nota3 + nota4) / 4));

        scan.close();
    }
}
