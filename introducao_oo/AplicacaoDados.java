package introducao_oo;

public class AplicacaoDados{
    public static void main(String[] args){
        Dados contato = new Dados();
       
        // contato.setNome("aaaa");
        // contato.setEndereco("rua azul");
        // contato.setTelefone("11 9999-999");

        // System.out.println(contato.getNome());
        // System.out.println(contato.getEndereco());
        // System.out.println(contato.getTelefone());

        Endereco end = new Endereco();
        end.setNomeRua("rua tres");
        end.setNumero("12");
        end.setEstado("sp");
        end.setComplemento("terreo");
        end.setCep("12984");
        end.setCidade("abababa");

        contato.setEndereco(end);
        System.out.println(contato.getNome());
        System.out.println(contato.getTelefone());

        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }


    }


}