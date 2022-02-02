import java.util.Scanner;
public class Exercicio26 {
   public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1, num2, num3, num4, num5;

        System.out.println("Digite os 5 números");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        num4 = scan.nextInt();
        num5 = scan.nextInt();
        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {
            System.out.println("o numero maior é:" + num1);
        } else if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
            System.out.println("o numero maior é:" + num2);
        } else if(num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
            System.out.println("o numero maior é:" + num3);
        } else if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
            System.out.println("o numero maior é:" + num4);
        } else {
            System.out.println("o numero maior é: " + num5);
        }
        
        int soma = num1 + num2 + num3 + num4 + num5;
        System.out.println("a soma dos numeros são: " + soma);
        System.out.println("a media dos numeros é: " + soma /5);  
        scan.close();
    } 
}
