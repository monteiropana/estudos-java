package introducao_oo;

public class Lamp {
   private String botao = "ligado";

   public void erguerBotao(){
       botao = "ligou";
   }
   public void abaixarBotao(){
       botao = "desligou";
   }
   public String posicaoFinal(){
      return botao;
   }
   public String getBotao(){
      return this.botao;
   }
}
