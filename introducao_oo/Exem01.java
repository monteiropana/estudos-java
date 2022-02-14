package introducao_oo;

public class Exem01 {
    public static void main(String[] args){
        Lampada lampada =  new Lampada();
        lampada.modelo = "A 60 Led";
        lampada.preco = 35.0f;
        lampada.cor = "branca";
        lampada.potencia = 220;
        lampada.situacao = "Apenas 4 lampadas disponiveis para venda";
        lampada.garantiaMeses = 2;
        
        lampada.tipos = new String[3];
        lampada.tipos[0] = "abajur";
        lampada.tipos[1] = "quarto";
        lampada.tipos[2] = "sala";

        
        
    }

}
