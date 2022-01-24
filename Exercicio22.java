import java.util.Scanner;

public class Exercicio22 {
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        int num1;
        int num2;
        String operacoes;
        int resultado;

        System.out.println("Digite o primeiro numero");
        num1 = scan.nextInt();

        System.out.println("Digite o segundo numero");
        num2 = scan.nextInt();
        

        System.out.println("Digite a operação que deseja realizar: + , - , / , * ");
        operacoes = scan.next();
        
        if(operacoes.equals("+")){
            resultado = num1 + num2;
        } else if(operacoes.equals("-")){
            resultado = num1 - num2;
        } else if(operacoes.equals("/")){
            resultado = num1 / num2;
        } else {
            resultado = num1 * num2;
        }
        
        boolean par = resultado % 2 == 0;
        System.out.println("o resultado " + resultado + " é " + (par ? "par" : "ímpar"));
    }
}
