package academy.devnunes.marratonajava.javacore.introducaometodos.test;

import academy.devnunes.marratonajava.javacore.introducaometodos.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.SetAge(20);
        pessoa.SetName("Cayque");

        System.out.println(pessoa.GetAge());
        System.out.println(pessoa.GetName());
    }
}
