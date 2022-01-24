import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int nota;

        
        //DO WHILE
        System.out.println("####### DO WHILE #######");
        do {
            System.out.println("digite uma nota entre 0 e 10! ");
            nota = scan.nextInt();
            if (nota < 0 && nota >= 10) {
                System.out.println("Essa nota é inválida!, digite outra: " + nota);
            }
        }
        while (nota < 0 || nota > 10);
        System.out.println("Essa nota é válida!" + nota);
        System.out.println("####### FIM DO WHILE #######");
        
        
        //WHILE
        System.out.println("####### WHILE #######");
        System.out.println("digite uma nota entre 0 e 10! ");
        nota = scan.nextInt();
        while (nota < 0 || nota > 10) {
            System.out.println("Essa nota é inválida!, digite outra: " + nota);
            System.out.println("digite uma nota entre 0 e 10! ");
            nota = scan.nextInt();
        }
        System.out.println("Essa nota é válida!" + nota);
        System.out.println("###### FIM WHILE #######");
    }
}
