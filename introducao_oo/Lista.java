package introducao_oo;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Contato> contatos;
    private String nome;

    public Lista() {
        contatos = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public List<Contato> getContatos(){
        return contatos;
    }
    public void setContatos(List<Contato> contatos){
        this.contatos = contatos;
    }
    
   
    

}
