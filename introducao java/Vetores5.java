public class Vetores5 {
    public static void main(String[] args){
        int[] listaA = new int[15];
        listaA[0] = 2;
        listaA[1] = 4;
        listaA[2] = 6;
        listaA[3] = 8;
        listaA[4] = 10;
        listaA[5] = 12;
        listaA[6] = 14;
        listaA[7] = 16;
        listaA[8] = 18;
        listaA[9] = 20;
        listaA[10] = 22;
        listaA[11] = 24;
        listaA[12] = 26;
        listaA[14] = 28;
        

        int[] listaB = new int[listaA.length];
        for(int i = 0; i < listaA.length; i++){
            listaB[i] = listaA[i] * i;
            System.out.println("A lista A " + listaA[i] + "é igual a listaB * o (i) indice = " + listaB[i]);
        }

  }  
}
