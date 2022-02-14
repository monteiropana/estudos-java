package introducao_oo;
public class LivrosDeBiblioteca {
        private String modelo;
        private String conteudo;
        private int volume;
        private double valor;
        private int paginas;

        public static void main(String[] args){
        String modelo;
        Double valor;
        int volume;
        String conteudo;
        int paginas;
        
        LivrosDeBiblioteca livro = new LivrosDeBiblioteca();

        livro.modelo = "capa dura, edição ilimitada";
        livro.conteudo ="livro de programação para iniciantes em java";
        livro.volume = 3;
        livro.valor = 500.0;
        livro.paginas = 600;

        System.out.println("o livro que pode ser emprestado aos leitores contém a seguinte descrição: ");
        System.out.println(livro.modelo);
        System.out.println(livro.conteudo);
        System.out.println(livro.paginas + "paginas");
        System.out.println(livro.volume +"," + " os volumes 1 e 2 estão esgotados.");
        System.out.println(livro.valor + " NÃO DISPONIVEL PARA VENDA!!");


    }
}
