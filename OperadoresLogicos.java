public class OperadoresLogicos {
    public static void main(String[] args){
        int valor1 = 1;
        int valor2 = 2;

        boolean resultado1 = ( valor1 == 1) && (valor2 == 2);
        System.out.println( " valor é 1 AND valor 2 é 2 - resultado:" + resultado1);

        boolean resultado2 = ( valor1 == 1) || (valor2 == 2);
    
        System.out.println(" valor 1 é 1 OR valor 2 é 2 - resultado:" + resultado2);

        boolean verdadeiro = true;
        boolean falso = false;
        
        System.out.println(verdadeiro && falso);
        System.out.println(verdadeiro || falso);
        System.out.println(verdadeiro ^ falso);
        System.out.println(!verdadeiro && falso);


    }

}
