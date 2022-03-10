package introducao_oo;

public class AplicacaoLamp {
    public static void main(String[] args){
        Lamp botao = new Lamp();

        botao.abaixarBotao();
        System.out.println("o botão para acender a luz: " + botao.getBotao());

        botao.erguerBotao();
        System.out.println("o botão para acenders a luz: " + botao.getBotao());

    }
}
