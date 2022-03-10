package introducao_oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AplicacaoCurso {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Curso curso = new Curso();
        curso.setNome("Tecnologia");
        curso.setHorario("noturno");
        Float somaNotas = 0f;
        System.out.println("digite as informações dos alunos");
        for(int i = 0; i < 2; i++) {
            Estudante estudante = new Estudante();
            System.out.println("digite um nome");
            estudante.setNome(scan.next());
            System.out.println("digite a matricula");
            estudante.setMatricula(scan.next());
            Float soma = 0f;
            for (int j = 0; j < 4; j++) {
                System.out.printf("digite a nota %d \n", j+1);
                Float nota = scan.nextFloat();
                estudante.getNotas().add(nota);
                soma += nota;
            }
            estudante.setMedia(soma/4);
            curso.getEstudantes().add(estudante);
            somaNotas += estudante.getMedia();

            System.out.printf("A media do aluno %s foi de %.2f \n", estudante.getNome(), estudante.getMedia());
            System.out.printf("Este aluno esta %s \n", estudante.estaAprovado());
        }
        System.out.printf("A media da turma foi de %.2f", somaNotas/curso.getEstudantes().size());
    }
}
