package introducao_oo;


public class AplicacaoCalculadora2 {
    public static void main(String[] args){
        
        
            Calculadora2 calculadora = new Calculadora2();
            int[] numeroSomar = {1, 2, 3, 4, 5};
    
           System.out.println(calculadora.somar(30.1, 30.2));
           System.out.println(calculadora.somar(10, 30));
           System.out.println(calculadora.somar(10, 5, 5));
           System.out.println(calculadora.somar(4, 6));
           
    
    }

}
