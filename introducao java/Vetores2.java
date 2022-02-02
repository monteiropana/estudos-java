public class Vetores2 {
    public static void main(String[] args){
        int[] tabelaA = new int[8];
        tabelaA[0] = 1;
        tabelaA[1] = 3;
        tabelaA[2] = 5;
        tabelaA[3] = 7;
        tabelaA[4] = 9;
        tabelaA[5] = 11;
        tabelaA[6] = 13;
        tabelaA[7] = 15;

        int[] tabelaB = new int[8];
        tabelaB[0] = tabelaA[0];
        tabelaB[1] = tabelaA[1];
        tabelaB[2] = tabelaA[2];
        tabelaB[3] = tabelaA[3];
        tabelaB[4] = tabelaA[4];
        tabelaB[5] = tabelaA[5];
        tabelaB[6] = tabelaA[6];
        tabelaB[7] = tabelaA[7];

        for(int i =0; i <tabelaA.length; i++){
        System.out.println("A tabelaA " + tabelaA[i] + "é igual a tabelaB * 2 " + tabelaB[i]);    
     }       
  }
}
