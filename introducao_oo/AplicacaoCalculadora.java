package introducao_oo;

public class AplicacaoCalculadora {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        
        System.out.println(calculadora.somar(10, 20, 10));
        System.out.println(calculadora.potencia(3, 3));
        System.out.println(calculadora.subtrair(10, 5));
        System.out.println(calculadora.multiplicar(10, 2));
        System.out.println(calculadora.dividir(10, 2));
        System.out.println(calculadora.fatorial(3));
        System.out.println(calculadora.ePar(10));
    }
}
