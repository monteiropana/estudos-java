package introducao_oo;

public class ContaCorrente {
    String titular;
    String nomeBanco;
    int anoDaConta;
    int limite;
    String numeroConta;
    String agencia;
    boolean chequeEspecial;
    double saldo;
    String saque;

    public void sacarDinheiro(double quantidadeRetirar){
        if(quantidadeRetirar <= saldo){
            saldo = saldo - quantidadeRetirar;
            System.out.println("saldo disponivel para saque ");    
        } else{
            System.out.println("voce não possui saldo para saque");
        }
    }
    public void consultarSaldo(){
        System.out.println("seu saldo atual é " + saldo);
        if(saldo < 0){
           chequeEspecial = true;
           System.out.println("voce esta usando o cheque especial");
        } else{
            System.out.println("voce ainda tem saldo disponivel para saque");
        }
    }
    public void depositarDinheiro(double quantidadeDepositar){
        saldo += quantidadeDepositar;
        consultarSaldo();
    }

}
