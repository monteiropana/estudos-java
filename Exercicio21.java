import java.util.Scanner;

public class Exercicio21 {
   public static void main(String[] args){
       Scanner scan = new Scanner(System.in);
       String turno;

       System.out.println("Em que turno você estuda");
       turno = scan.nextLine();

       if(turno.equalsIgnoreCase("m")){
           System.out.println("periodo matutino, Bom dia!!");
       } else if(turno.equalsIgnoreCase("v")){
           System.out.println("periodo vespertino, Boa tardee!!");
       } else if(turno.equalsIgnoreCase("n")){
           System.out.println("perido noturno, Boa noite");
       } else{
           System.out.println("valor invalido!");
       }
       scan.close();
   } 
}
