package academy.devnunes.marratonajava.javacore.associacao.Test;

import academy.devnunes.marratonajava.javacore.associacao.domain.Escola;
import academy.devnunes.marratonajava.javacore.associacao.domain.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Kakashi sensei");
        Professor[] professores = {professor};
        Escola school = new Escola("Konoha", professores);

        school.imprime();
    }
}
