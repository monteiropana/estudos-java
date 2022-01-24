import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String usuario;
        String senha;

        
        do{
            System.out.println(" Digite seu nome de usuário:");
            usuario = scan.nextLine();
    
            System.out.println("Digite agora sua senha:");
            senha = scan.nextLine();
            if(usuario.equals(senha)){
                System.out.println("Erro, usuário e senha iguais!");
            } else{
                System.out.println("Certo, nome de usuário e senha são diferentes!");
            }
        }  while(usuario.equals(senha));
        System.out.println("digite novamente um usuário e senha diferente!");
    }
}

