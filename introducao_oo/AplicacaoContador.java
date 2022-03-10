package introducao_oo;

public class AplicacaoContador {
    public static void main(String[] args){
        Contador contador1 = new Contador();
        System.out.println(contador1.retornarContador());

        Contador contador2 = new Contador();
        System.out.println(contador2.retornarContador());


        contador1.zerarContador();
        System.out.println(contador1.retornarContador());
        System.out.println(contador2.retornarContador());


    }

    
}
