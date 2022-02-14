package introducao_oo;
public class Livro {
    private String nome;
    private Object capa;
    private int paginas;
    private Object valor;

    public static void main(String[] args){
        // atributos de um livro
        String nome;
        String capa;
        int paginas;
        double valor;

        Livro apostila = new Livro();
        apostila.nome = "estudos java";
        apostila.capa = "virtual";
        apostila.paginas = 560;
        apostila.valor = 490.00;

        System.out.println(apostila.nome);
        System.out.println(apostila.capa);
        System.out.println(apostila.paginas);
        System.out.println(apostila.valor);        
    }
}
