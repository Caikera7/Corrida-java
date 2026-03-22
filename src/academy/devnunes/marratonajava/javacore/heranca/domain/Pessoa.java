package academy.devnunes.marratonajava.javacore.heranca.domain;

public class Pessoa {
    protected String name;
    protected int cpf;
    protected Endereco endereco;


    public void imprime(){
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
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
}
