import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String letra;
        System.out.println("digite uma letra");
        letra = scan.nextLine();

        if(letra.equals("a")){
            System.out.println("Essa letra é vogal");
        } else if(letra.equals("e")){
            System.out.println("Essa letra é vogal");
        } else if(letra.equals("i")){
            System.out.println("Essa letra é vogal");
        } else if(letra.equals("o")){
            System.out.println("Essa letra é vogal");
        } else if(letra.equals("u")){
            System.out.println("Essa letra é vogal");
        } else{
            System.out.println("Essa letra é consoante");
        }
    }
}
