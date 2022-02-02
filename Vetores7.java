public class Vetores7 {
    public static void main(String[] args){
        int[] listaA = new int[10];
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
        
        int[] listaB = new int[listaA.length];
        listaB[0] = 1;
        listaB[1] = 3;
        listaB[2] = 5;
        listaB[3] = 7;
        listaB[4] = 9;
        listaB[5] = 11;
        listaB[6] = 13;
        listaB[7] = 15;
        listaB[8] = 17;
        listaB[9] = 19;
        
        
        int[] listaC = new int[listaA.length];
        

        for(int i = 0; i < listaA.length; i++){
            listaC[i] = listaA[i] - listaB[i];
            System.out.println("O resultado da lista C = " + " listaA " + listaA[i] + " - listaB " + listaB[i] + " total de = " + listaC[i]);
        }

    }
}
