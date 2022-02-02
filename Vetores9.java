public class Vetores9 {
     public static void main(String[] args){
        float[] listaA = new float [10];   
        listaA[0] = 20;  
        listaA[1] = 30;  
        listaA[2] = 40;  
        listaA[3] = 50;  
        listaA[4] = 60;  
        listaA[5] = 10;
        listaA[6] = 20;
        listaA[7] = 30;
        listaA[8] = 40;
        listaA[9] = 50;

        float[] listaB = new float [listaA.length];
        listaB[0] = 10;  
        listaB[1] = 10;  
        listaB[2] = 10;  
        listaB[3] = 10;  
        listaB[4] = 10;  
        listaB[5] = 10;
        listaB[6] = 10;
        listaB[7] = 10;
        listaB[8] = 10;
        listaB[9] = 10;

       float[] listaC = new float [listaA.length];

        for(int i = 0; i < listaA.length ; i++){
            listaC[i] = listaA[i] / listaB[i];
            System.out.println("O resultado da divisão é lista A " + listaA[i] + "dividido por listaB " + listaB[i] + " é igual a listaC " + listaC[i]);
        } 
  }  
}
