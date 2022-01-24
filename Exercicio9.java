import java.util.Scanner;
public class Exercicio9 {
    public static void main(String[] args){
    double grausFahrenheint;
    
    Scanner scan = new Scanner (System.in);
    System.out.println(" Qual a temperatura em graus Fahrenheint?");
    grausFahrenheint = scan.nextDouble();

    System.out.println(" A temperatura em graus Celsius é:" + ((grausFahrenheint - 32) / 1.8));





    }
    
}
