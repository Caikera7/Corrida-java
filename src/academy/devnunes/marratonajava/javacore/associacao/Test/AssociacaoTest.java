package academy.devnunes.marratonajava.javacore.associacao.Test;

import academy.devnunes.marratonajava.javacore.associacao.domain.Aluno;
import academy.devnunes.marratonajava.javacore.associacao.domain.Local;
import academy.devnunes.marratonajava.javacore.associacao.domain.Professor;
import academy.devnunes.marratonajava.javacore.associacao.domain.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Rua joão batista, 98");

        Aluno alunos = new Aluno("Cayque", 19);
        Aluno[] alunosParaSeminario = {alunos};

        Professor prof = new Professor("Jilson", "Matematica");

        Seminario seminario = new Seminario("Na onde so Deus ve", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        prof.setSeminarios(seminariosDisponiveis);
    }
} 
