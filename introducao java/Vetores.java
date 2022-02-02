public class Vetores {
        public static void main(String[] args){
            // Array / vetores e matrizes

            double tempDia01 = 33.3;
            double tempDia02 = 36.0;
            double tempDia03 = 34.5;
            

            double[] temperaturas = new double[100];
            temperaturas[0] = 33.3;
            temperaturas[1] = 36.0;
            temperaturas[2] = 34.5;

            System.out.println("A temperatura no dia 01 foi de: " + temperaturas[0]);
            System.out.println("O tamanho desse array é: " + temperaturas.length);
                for(int i = 0; i <temperaturas.length; i++){
            System.out.println("A temperatura do dia: " + (i+1) + " é " + temperaturas[i] );  
            }

    }
}
