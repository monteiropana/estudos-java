import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
        String letra;

        
        System.out.println("digite uma letra");
        letra = scan.nextLine();

        if(letra.equals("m")){
            System.out.println("MASCULINO");
        } else if(letra.equals("f")){
            System.out.println("FEMININO");
        } else {
            System.out.println("SEXO INVALIDO");
        }
    }
}
