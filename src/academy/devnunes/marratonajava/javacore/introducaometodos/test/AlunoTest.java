package academy.devnunes.marratonajava.javacore.introducaometodos.test;

import academy.devnunes.marratonajava.javacore.introducaometodos.domain.Aluno;
import academy.devnunes.marratonajava.javacore.introducaometodos.domain.ImpressaoAluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno student = new Aluno();
        Aluno schoolboy = new Aluno();
        ImpressaoAluno printer = new ImpressaoAluno();

        student.name = "Pedro";
        student.age = 18;
        student.notice = 6.0;

        schoolboy.name = "Matheus";
        schoolboy.age = 19;
        schoolboy.notice = 7.0;

        //referencia de outro objeto
        printer.imprime(student);

        printer.imprime(schoolboy);
    }
}
