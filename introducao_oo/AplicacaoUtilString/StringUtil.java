package introducao_oo.AplicacaoUtilString;


public class StringUtil{

    public String pegaLetra(String texto, int indice){
        String letra = "";
        for(int i=0; i<texto.length(); i++){
            if(i== indice){
                letra = texto.charAt(i) + "";
            }
        }
        return letra;
    }

    public int pegaIndice(String texto, char letra){
        int indice = 0;
        for(int i=0; i<texto.length(); i++){
            if(letra == texto.charAt(i)){
                indice=i;
                return i;
            }
        } 
        return indice;
    }
}
