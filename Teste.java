import java.util.Scanner;

public class Teste {
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num1;
        int num2;
        int resultado;
        int resto;
        boolean par;

        System.out.println("Digite o primeiro numero");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo numero");
        num2 = scan.nextInt();
    
        resultado = num1 + num2;
        System.out.println("resultado da soma é: " + resultado);

        resto = resultado % 2;
        System.out.println("o resto da divisao do resultado da soma por 2 é: " + resto);

        par = resto == 0;
        System.out.println("o resultado da soma é par? " + par);
       
    }
}
