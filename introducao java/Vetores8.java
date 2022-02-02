public class Vetores8 {
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
        listaB[0] = 10;
        listaB[1] = 20;
        listaB[2] = 30;
        listaB[3] = 40;
        listaB[4] = 50;
        listaB[5] = 60;
        listaB[6] = 70;
        listaB[7] = 80;
        listaB[8] = 90;
        listaB[9] = 100;

        int[] listaC = new int[listaA.length];

        for(int i = 0; i < listaA.length; i++){
            listaC[i] = listaA[i] * listaB[i];  
            System.out.println("A multiplicação da listaA: " + listaA[i] + " com a listaB é : " + listaB[i] + " tem como resultado = " + listaC[i]);  
        }
        

    }
}
