public class LoopWhile {
    public static void main(String[] args){
    int i = 0;
    int max = 10;
    // while = avalia a expressão e se for verdadeiro executa a operação, e quando ela for falsa 
    // ela para e continua executando o restante do programa (pulando loop)

    // do While = primeiro EXECUTA, e depois avalia a expressão, e caso a expressão seja falsa, não
    // executa mais.
    System.out.println("contando ate : " + max);

    while( i <= max){
        System.out.println("valor de i: " + i);
        i++;
    }
    System.out.println(i);
    do {
        i ++;
        System.out.println("valor de i " + i);
    } while ( i < 15);
        System.out.println(i);
  } 

}
