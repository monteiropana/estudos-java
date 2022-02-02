import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String nome;
        int idade;
        float salario;
        String sexo;
        String estadoCivil;

        
        System.out.println("Digite uma idade entre 0 e 150:");
        idade = scan.nextInt();
        if( idade > 0 && idade <= 150 ){
            System.out.println("Essa idade é válida!");
        }
        System.out.println("Digite qual é o sexo:");
        sexo = scan.next();
        if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
            System.out.println("Sexo digitado é valido");
        } 

        System.out.println("Qual é o estado civil??");
        estadoCivil = scan.next();
        if(estadoCivil.equalsIgnoreCase("C") || estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D")){
            System.out.println("Esse estado civil é válido!");
        }
        
        System.out.println("Digite um salário");
        salario = scan.nextFloat();
        if(salario > 0){
            System.out.println("Salario válido!");
        }
        System.out.println("Digite um nome maior que 3 caracteres");
        nome = scan.next();
        if(nome.length() > 3){
            System.out.println("Esse nome é válido!");
        }
        
        scan.close();
    }
}
