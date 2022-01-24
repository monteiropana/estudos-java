import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    
    int num1;
    int num2;
    int num3;

    System.out.println("digite o primeiro numero: ");
    num1 = scan.nextInt();

    System.out.println("digite o segundo numero ");
    num2 = scan.nextInt();
    
    System.out.println("digite o terceiro numero ");
    num3 = scan.nextInt();

    if(num1 > num2 && num1 > num3){
        System.out.println("esse numero é o maior" + num1);
    } else if( num2 > num1 && num2 > num3){
        System.out.println("esse numero é o maior " + num2);
    } else if( num3 > num1 && num3 > num2){
        System.out.println("esse numero é o maior " + num3);
    }
  }
}
