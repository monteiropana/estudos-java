import java.util.Scanner;

public class LeituraDadosTeclado {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu nome completo:");
        String nomeCompleto = scan.nextLine();
        System.out.println(" seu nome é: " + nomeCompleto);

        System.out.println("Digite seu primeiro nome :");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("Digite sua idade :");
        int idade = scan.nextInt();
        System.out.println("sua idade é: " + idade);

        // System.out.println("Digite sua altura :");
        // double altura = scan.nextDouble();
        // System.out.println("seu altura é " + altura);

        // Outra opção de leitura de teclado

        System.out.println(" Digite seu segundo nome, ida, alt, e se tem filhos,");
        
        String segundoNome = scan.next();
        int ida = scan.nextInt();
        float alt = scan.nextFloat();
        boolean filhos = scan.nextBoolean();
        System.out.println(" Voce digitou os seguintes topicos ");
        System.out.println(" Primeiro nome " + segundoNome);
        System.out.println(" idade " + ida);
        System.out.println(" altura " + alt);
        System.out.println(" filhos " + filhos);
    }
}
