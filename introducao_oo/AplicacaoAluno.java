package introducao_oo;

public class AplicacaoAluno {
    public static void main(String[] args){
        Aluno aluno = new Aluno();
        aluno.nome = "ana";
        aluno.matricula = 174892174;
        aluno.curso = "analise e desenvolvimento de sistemas";
        aluno.nota1 = 1;
        aluno.nota2 = 6;
        aluno.nota3 = 2;    
        aluno.disciplina1 = "banco de dados";
        aluno.disciplina2 = "Algoritmos";
        aluno.disciplina3 = "desenvolvimento de sofware";

        aluno.aprovado();

    } 
}
