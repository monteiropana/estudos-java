package introducao_oo;

import java.util.Scanner;

public class AplicacaoLista {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Lista agenda = new Lista();
        System.out.println("digite o nome da agenda: ");
        agenda.setNome(scan.next());
        System.out.println(agenda.getNome());
        System.out.println("digite 3 contatos:");
        
        for (int i = 1; i < 4; i++) {
            Contato contato = new Contato();
            System.out.printf("digite os dados do contato %d: \n", i);
            System.out.println("digite um nome:");
            contato.setNome(scan.next());
            System.out.println("digite um telefone:");
            contato.setTelefone(scan.next());
            System.out.println("digite o email:");
            contato.setEmail(scan.next());
            agenda.getContatos().add(contato);
        }

        // outra opção de execução:
        // List<Contato> contatos = new ArrayList<Contato>();
        // contatos.add(contato1);
        // contatos.add(contato2);
        // contatos.add(contato3);
        // agenda.setContatos(contatos);


        
        
        
    }
}
