public class Vetores6 {
    public static void main(String[] args){
    int[] listaA =new int[10];
    
    listaA[0] = 10;
    listaA[1] = 11;
    listaA[2] = 12;
    listaA[3] = 13;
    listaA[4] = 14;
    listaA[5] = 15;
    listaA[6] = 16;
    listaA[7] = 17;
    listaA[8] = 18;
    listaA[9] = 19;

    int[] listaB = new int[listaA.length];
    listaB = listaA;
    int[] listaC = new int[listaA.length];
    
    for( int i = 0; i < listaA.length; i++){
        listaC[i] = listaA[i] + listaB[i];
        System.out.println("A soma da listaA = " + listaA[i] + " com a  listaB = " + listaB[i] + " tem como resultado a listaC = " + listaC[i]);
    }
  }  
}
