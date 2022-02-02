import java.util.Scanner;

public class Exercicio5 {
        public static void main(String []args){
        Scanner scan = new Scanner (System.in);
        float metragem;
        System.out.println("digite um numero");
        metragem = scan.nextFloat();
        System.out.println (" esse numero em centimetros fica: " + (metragem * 100) + "cm");


        scan.close();
}


}