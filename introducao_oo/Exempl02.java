package introducao_oo;

public class Exempl02 {
    public static void main(String[] args){
        Livro apostila = new Livro();
        apostila.nome = "estudos java";
        apostila.capa = "virtual";
        apostila.paginas = 560;
        apostila.valor = 490.00;
        apostila.autor = "maria lurdes";
        apostila.anoLancamento = 2000;

        System.out.println("o nome do livro é : " + apostila.nome);
        System.out.println("o nome do autor do livro é : " + apostila.autor);
        System.out.println("o ano de lancamento do livro foi em : " + apostila.anoLancamento);

    }
}
