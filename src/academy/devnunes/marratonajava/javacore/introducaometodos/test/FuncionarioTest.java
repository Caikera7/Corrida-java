package academy.devnunes.marratonajava.javacore.introducaometodos.test;

import academy.devnunes.marratonajava.javacore.introducaometodos.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario func = new Funcionario("Cayque", 20);        

        func.SetSalary(new double[]{1000,2000, 3000});
        func.MediaSalarial();
        func.imprime();
    }
}
