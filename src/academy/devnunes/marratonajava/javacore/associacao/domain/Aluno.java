package academy.devnunes.marratonajava.javacore.associacao.domain;

public class Aluno {

    private String name;
    private int idade;
    private Seminario seminario;

    
    public Aluno(String name, int idade) {
        this.name = name;
        this.idade = idade;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getIdade() {
        return idade;
    }


    public void setIdade(int idade) {
        if(idade != 0){
            return;
        }
        this.idade = idade;
    }

    

    
}
