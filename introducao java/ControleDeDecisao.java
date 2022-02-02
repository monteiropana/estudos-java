import java.util.Scanner;

public class ControleDeDecisao {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int idade;
        
        System.out.println("Digite uma idade ");
        idade = scan.nextInt();

        if (idade >= 18){
            System.out.println("E maior de idade ");    
        }  else { 
            System.out.println("NÃO é maior de idade ");    
        }

        System.out.println("Digite o valor do item ");
        double valor = scan.nextDouble();

        if (valor <= 10){
            System.out.println("Pode comprar, está barato!!! ");
        }
         else if (valor > 10 && valor < 15){
            System.out.println("hmm, que caro! peça desconto.");
        } else if (valor >= 15 && valor < 17){
            System.out.println("hmmm, acho que deve pesquisar mais!");
        } else {
            System.out.println("extremamente caro!!");
        }

        scan.close();
    }
}
