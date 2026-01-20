package academy.devnunes.marratonajava.javacore.introducaoclasses.test;

import academy.devnunes.marratonajava.javacore.introducaoclasses.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.name = "Cayque";
        estudante.age = 19;
        estudante.sex = 'M';
        System.err.println("Nome do estudante é " + estudante.name);
        System.err.println("Idade do estudante é " +estudante.age);
        System.err.println("O sexo do estudante é " + estudante.sex);
    }
}
