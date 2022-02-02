public class Vetores1 {
  public static void main(String[] arg){
    int[] listaA = new int[5];
    listaA[0] = 20;
    listaA[1] = 20;
    listaA[2] = 30;
    listaA[3] = 40;
    listaA[4] = 50;

    int[] listaB = new int[5];

    for(int i = 0; i < listaA.length; i++){
      listaB[i] = listaA[i];  
      System.out.println("a lista A " + listaA[i] + " é igual a lista B " + listaB[i]);
    }
  }
}
