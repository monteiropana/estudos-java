package introducao_oo;

public class Recursividade {
    public static int recebeNumero (int n){
        if(n == 1){
            return 1;
        } 
        
        return n + recebeNumero(n-1);
    }
}
