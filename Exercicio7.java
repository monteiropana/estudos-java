import java.util.Scanner;
public class Exercicio7 {
    public static void main(String[] args) {
        int lado;
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o lado do quadrado");
        lado = scan.nextInt();

        int area = lado * lado;
        System.out.println(" o dobro da area do quadrado é :" + area * 2);


    }
}
