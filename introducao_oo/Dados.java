package introducao_oo;

public class Dados {
    private String nome;
    private Endereco endereco;
    private String telefone;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    public void setEndereco(Endereco end){
        this.endereco = end;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
}
