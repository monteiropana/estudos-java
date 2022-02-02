import java.util.Random;
public class Matrizes {
    public static void main(String[] args){
        Random r = new Random();
        int[][] notasAleatorias = new int[4][4];

        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for(int i = 0; i < notasAleatorias.length; i++){
            for(int j = 0; j < notasAleatorias.length; j++){
                notasAleatorias[i][j] = r.nextInt(10);
                System.out.printf("aluno [%d] nota [%d]: %d \n", i, j, notasAleatorias[i][j]);

                if (notasAleatorias[i][j] >= maior) {
                    maior = notasAleatorias[i][j];
                    linha = i;
                    coluna = j;
                }
            } 
        }
        System.out.printf("O maior numero é %d e esta na linha %d e na coluna %d", maior, linha, coluna);
    }
}