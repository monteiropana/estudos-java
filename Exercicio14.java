import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int primeiroNumero;
        int segundoNumero;
        
        System.out.println("digite o primeiro numero");
        primeiroNumero = scan.nextInt();

        System.out.println("digite o segundo numero");
        segundoNumero = scan.nextInt();
        
        System.out.println("o numero maior é: " + (primeiroNumero > segundoNumero ? primeiroNumero : segundoNumero));
        // if(primeiroNumero > segundoNumero){
        // } else{
        //     System.out.println("o numero maior é: " + segundoNumero);
        // }  
        scan.close();
    }    
}
