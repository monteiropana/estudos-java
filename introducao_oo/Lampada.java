package introducao_oo;
public class Lampada {
    private double preco;
    private String modelo;
    private int volts;
    private String situacao;

    public static void main(String[] args){
        String modelo;
        float preco;
        int volts;
        String situacao;
        
        Lampada lampada = new Lampada();
        
        lampada.modelo = "luz branca de led";
        lampada.preco = 39.90;
        lampada.volts = 110;
        lampada.situacao = "em perfeito estado";
        
        System.out.println("A lampada que está sendo vendida no mercado está com as seguintes descrições:");
        System.out.println(lampada.modelo);
        System.out.println(lampada.preco);
        System.out.println(lampada.volts + " volts");
        System.out.println(lampada.situacao);
    }

    public static String getposicaoFinal() {
        return null;
    }  
}
