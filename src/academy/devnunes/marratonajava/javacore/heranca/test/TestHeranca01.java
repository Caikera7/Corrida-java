package academy.devnunes.marratonajava.javacore.heranca.test;

import academy.devnunes.marratonajava.javacore.heranca.domain.Endereco;
import academy.devnunes.marratonajava.javacore.heranca.domain.Funcionarios;
import academy.devnunes.marratonajava.javacore.heranca.domain.Pessoa;

public class TestHeranca01 {
public static void main(String[] args) {
    Endereco endereco = new Endereco();
    endereco.setCep("01234-123");
    endereco.setRua("Rua pouso alegre");
    Pessoa pessoa = new Pessoa("cayque");
    pessoa.setCpf("123456789");
    pessoa.setEndereco(endereco);
    pessoa.imprime();

    System.out.println("--------------");

    Funcionarios func = new Funcionarios("Pedro");
    func.setCpf("123324334");
    func.setEndereco(endereco);
    func.setSalario(2000);
    func.imprime();
}
}
