package introducao_oo;

public class Calculadora {

    public int somar(int valor1, int valor2) {
        return valor1 + valor2;
    }

    public int potencia(int valor, int potencia) {
        int resultado = valor;
        for (int i = 1; i < potencia; i++) {
            resultado = resultado * valor;
        }
        return resultado;
    }
    public int subtrair(int valor1, int valor2){
        return valor1 - valor2;
    }
    public int multiplicar(int valor1, int valor2){
        return valor1 * valor2;
    }
    public int dividir(int valor1, int valor2){
        return valor1 / valor2;
    }
    public int fatorial(int n){
        int resultado = n;
        for( int i = n-1; i >= 1; i--){
            resultado = resultado * i;
        }
        return resultado;
    }
    public boolean ePar(int n){
       boolean resultado;
       if(n%2 ==0){
           resultado = true;
       }
       else{
            resultado = false;
       }
        return resultado;
    }
}
