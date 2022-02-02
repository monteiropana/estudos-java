public class Vetores3 {
    public static void main(String[] args){
        int[] listaA = new int[15];
        listaA[0] = 10;
        listaA[1] = 20;
        listaA[2] = 30;
        listaA[3] = 40;
        listaA[4] = 50;
        listaA[5] = 60;
        listaA[6] = 70;
        listaA[7] = 80;
        listaA[8] = 90;
        listaA[9] = 100;
        listaA[10] = 110;
        listaA[11] = 120;
        listaA[12] = 130;
        listaA[13] = 140;
        listaA[14] = 150;

        int[] listaB = new int[listaA.length];
        for( int i = 0; i < listaA.length; i++){
            listaB[i] = listaA[i] * listaA[i];
            System.out.println("A listaA " + listaA[i] + " é igual a listaB ao quadrado = " + listaB[i]);
        }
    }
}
