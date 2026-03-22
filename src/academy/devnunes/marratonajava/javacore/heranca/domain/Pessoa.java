package academy.devnunes.marratonajava.javacore.heranca.domain;

public class Pessoa {
    protected String name;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("bloco static class super pessoa");
    }

    {
        System.out.println("bloco não static super class pessoa ");
    }

    public Pessoa(String name, String cpf) {
        System.out.println("dentro do constructor pessoa");
        this(name);
        this.cpf = cpf;
    }

    public Pessoa(String name) {
        this.name = name;
    }

    public void imprime() {
        System.out.println(this.name);
        System.out.println(this.endereco.getRua() + " " + endereco.getCep());
        System.out.println(this.cpf);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}
