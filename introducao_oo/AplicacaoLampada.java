package introducao_oo;

import java.io.ObjectInputFilter.Status;

public class AplicacaoLampada {
    public static void main(String[] args){
        LampadaLigaDesliga lampada = new LampadaLigaDesliga();
        
        lampada.ligarLampada();
        System.out.println("a lampada esta " + lampada.getSituacao());

        lampada.desligarLampada();
        System.out.println("a lampada esta " + lampada.getSituacao());
        
    }
}
