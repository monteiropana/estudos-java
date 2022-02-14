package introducao_oo;

public class LampadaLigaDesliga {
    String situacao = "desligada";
    
    public void ligarLampada(){
        situacao = "ligada";
    }

    public void desligarLampada(){
        situacao = "desligada";
    }

    public String getSituacao() {
        return this.situacao;
    }
}
