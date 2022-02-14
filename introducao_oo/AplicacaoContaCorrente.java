package introducao_oo;
import java.util.Scanner;
public class AplicacaoContaCorrente {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        ContaCorrente conta = new ContaCorrente();
        
        conta.titular = "Ana paula";
        conta.nomeBanco = "Brasil";
        conta.anoDaConta = 2016;
        conta.limite = 2000;
        conta.numeroConta = "19283000";
        conta.agencia = "2222";
        conta.chequeEspecial = true;
        conta.saldo = 30;
        double valor;
        
        System.out.println("digite o valor que sera retirado:");
        valor = scan.nextDouble();
        conta.sacarDinheiro(valor);

        conta.consultarSaldo();

        System.out.println("o valor que sera depoistado é de :");
        valor = scan.nextDouble();
        conta.depositarDinheiro(valor);
        

    }
}
