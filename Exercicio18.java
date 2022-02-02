import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int nota1;
        int nota2;
        int media;
        
        System.out.println("digite a primeira nota");
        nota1 = scan.nextInt();

        System.out.println("digite a segunda nota");
        nota2 = scan.nextInt();

        media = (nota1 + nota2) / 2;    
        System.out.println(" a media da nota é: " + media );
        
        if(media >= 70){
            System.out.println("aprovado");
        } else if(media < 70){
            System.out.println("reprovado");
        } else if(media == 70){
            System.out.println("Aprovado com distinção");
        }

        scan.close();
    }
}
