package introducao_oo;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;
    private String horario;
    private List<Estudante> estudantes;

    public Curso() {
        this.estudantes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getHorario() {
        return horario;
    }
    public void setHorario(String horario) {
        this.horario = horario;
    }
    public List<Estudante> getEstudantes() {
        return estudantes;
    }
    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    public void alterarDados(String nome, String horario) {
        this.nome = nome;
        this.horario = horario;
    }
}
