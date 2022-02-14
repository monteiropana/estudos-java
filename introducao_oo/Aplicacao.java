package introducao_oo;

import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String model = "";

        System.out.println("Irmao, digita um modelo ai");
        model = scan.next();

        Carro car = new Carro();
        car.setModelo(model);
        System.out.println(car.getModelo());
    }
}
