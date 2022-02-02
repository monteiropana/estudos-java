import java.util.Scanner;

public class Exercicios123 {
    public static void main(String []args){
        //exercicio 1
        System.out.println("olá mundo!!!");

        //exercicio 2
        Scanner scan = new Scanner (System.in);
        System.out.println("digite um numero");
        int numero = scan.nextInt();
        System.out.println(" o numero informado foi: " + numero);

        //exercicio 3
        int numero1;
        int numero2;
        System.out.println("digite um novo numero");
        numero1 = scan.nextInt();
        System.out.println(" digite outro numero");
        numero2 = scan.nextInt();
        System.out.println ("a soma dos numeros1 e numero2 é:  " + (numero1 + numero2));
        
        scan.close();


    }


}
