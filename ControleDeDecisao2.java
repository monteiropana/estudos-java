import java.util.Scanner;
public class ControleDeDecisao2 {
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um dia da semana!");

        int diaDaSemana = scan.nextInt();
        if (diaDaSemana == 1){
        System.out.println("domingo");  
        } else if (diaDaSemana ==2){
          System.out.println("segunda feira");  
        } else if (diaDaSemana ==3){
          System.out.println("terça feira ");  
        } else if (diaDaSemana ==4){
          System.out.println("Quarta feira");  
        } else if (diaDaSemana ==5){
          System.out.println("quinta feira"); 
        } else if (diaDaSemana==6){
          System.out.println("sexta feira");  
        } else if (diaDaSemana==7){
          System.out.println("sabado");  
        } else{
          System.out.println("não é um dia da semana válido!");  
        }

        switch(diaDaSemana){
        case 1 : System.out.println("domingo"); break;    
        case 2 : System.out.println("segunda"); break;    
        case 3 : System.out.println("terça"); break;    
        case 4 : System.out.println("quarta"); break;    
        case 5 : System.out.println("quinta"); break;    
        case 6 : System.out.println("sexta"); break;    
        case 7 : System.out.println("sabádo"); break;   
        default:System.out.println("não é um dia da semana válido!!!");  
        }

        // - variável pode ter seu valor alterado no código.
        // - constante é um valor que nunca muda, é fixo e como boas práticas de programação
        // o nome dessa constante é escrito em MAIUSCULO, e para definir que é uma constante 
        // tem que escrever final antes do nome. = final MAIUSCULO = 123;
    }
}
