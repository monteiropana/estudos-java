package introducao_oo;

public class Fibonacci {
    public static int calculaFibonacci(int n){
        if(n<2){
            return n;
        }
        return calculaFibonacci(n - 1) + calculaFibonacci(n - 2);        
    }
}
