package academy.devnunes.marratonajava.javacore.introducaometodos.test;

import academy.devnunes.marratonajava.javacore.introducaometodos.domain.Aluno;

public class AlunoTest02 {
    public static void main(String[] args) {
         Aluno student = new Aluno();
        Aluno schoolboy = new Aluno();

        student.name = "Caio";
        student.age = 20;
        student.notice = 6.0;

        schoolboy.name = "Igor";
        schoolboy.age = 20;
        schoolboy.notice = 7.0;

        //trablhando com a palavra reservada THIS
        student.imprime();
        schoolboy.imprime();
    }
}
