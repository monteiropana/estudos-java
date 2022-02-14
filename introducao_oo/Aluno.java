package introducao_oo;

public class Aluno {
    String nome;
    int matricula;
    String curso;
    String disciplina1;
    String disciplina2;
    String disciplina3;
    int nota1;
    int nota2;
    int nota3;

    public void aprovado(){
        if(nota1 >= 7) {
            System.out.println("Esse aluno está aprovado: " + nome + " na disciplina: " + disciplina1 + " com a nota: " + nota1);
        } else if(nota2 >= 7) {
            System.out.println("Esse aluno está aprovado " + nome + " na disciplina: " + disciplina2 + " com a nota: " + nota2);
        } else if(nota3 >= 7) {
            System.out.println("Esse aluno está aprovado " + nome + " na disciplina: " +disciplina3 + " com a nota: " + nota3);
        } else{
            System.out.println("Esse aluno está reprovado " + nome);
        }
    }    
}
