import java.util.Scanner;
public class Exercicio12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        float altura;
        
        System.out.println("Qual a sua altrua?");
        altura = scan.nextFloat();
        System.out.println( " Seu peso ideal, de acordo com sua altura é " + ((72.7 * altura) - 58));
        


        scan.close();
   }
}
