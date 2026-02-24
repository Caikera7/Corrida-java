package academy.devnunes.marratonajava.javacore.Associacao.domain;

public class Escola {
    private String name;
    private Professor[] professores;
    
    public Escola(String name) {
        this.name = name;
    }

    public Escola(String name, Professor[] professores) {
        this.name = name;
        this.professores = professores;
    }

    public void imprime(){
        System.out.println(this.name);
        if(professores == null) return;
        for(Professor prof: professores){
            System.out.println(prof.getName());
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }

    
}
