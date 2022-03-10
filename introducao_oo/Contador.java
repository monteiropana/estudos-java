package introducao_oo;

public class Contador {
    
    private static int contador = 0;

    public Contador(){
        contador = contador + 1; 
    }
    public void zerarContador(){
        contador = 0;
    }
    public int retornarContador(){
        return contador;
    }

}
