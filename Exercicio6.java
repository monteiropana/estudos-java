import java.util.Scanner;

public class Exercicio6 {
    final static float PI = 3.14f;
    public static void main(String[] args) {
        float raio;
        System.out.println("Entre com o raio:");
        Scanner scan = new Scanner(System.in);
        raio = scan.nextFloat();
        System.out.println("A área do circúlo é: " + calcularAreaCirculo(raio));
        scan.close();
    }


    //area do circulo
    //A = pi * r²  (r = raio)
    public static double calcularAreaCirculo(float raio) {
        double area = PI * (raio * raio);
        return area;
    }
}
