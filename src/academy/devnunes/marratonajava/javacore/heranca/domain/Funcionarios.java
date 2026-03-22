package academy.devnunes.marratonajava.javacore.heranca.domain;

public class Funcionarios extends Pessoa {

    private double salario;

    static {
        System.out.println("bloco static class super funcionario");
    }

    {
        System.out.println("bloco não static super class funcionario ");
    }
    

    public Funcionarios(String name) {
        super(name);
        System.out.println("dentro do constructor funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.name + " recebi meu pagamento de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
}
