package introducao_oo;

import java.util.ArrayList;
import java.util.List;

public class Estudante {
    private String nome;
    private String matricula;
    private List<Float> notas;
    private Float media;

    public Estudante() {
        this.notas = new ArrayList<>();
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getMatricula(){
        return matricula;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public List<Float> getNotas() {
        return notas;
    }
    public void setNotas(List<Float> notas) {
        this.notas = notas;
    }
    public Float getMedia() {
        return media;
    }
    public void setMedia(Float media) {
        this.media = media;
    }

    public String estaAprovado() {
        if (media >= 7) {
            return "APROVADO";
        }
        return "REPROVADO";
    }
}
