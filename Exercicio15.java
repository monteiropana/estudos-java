import java.util.Scanner;

public class Exercicio15 {
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int valor;
        
        System.out.println("Digite um numero");
        valor = scan.nextInt();

        if(valor >=0){
           System.out.println(" esse numero é positivo");
        } else{
           System.out.println(" esse numero é negativo");
        }
        scan.close();
    }    
}
