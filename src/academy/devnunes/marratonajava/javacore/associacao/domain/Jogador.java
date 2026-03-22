package academy.devnunes.marratonajava.javacore.associacao.domain;

public class Jogador {
    private String name;
    private Time time;

    
    public Jogador(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }  

    public void imprime(){
        System.out.println(this.name);
        if(time == null) return;
        System.out.println(time.getName());
    }
    public void setName(String name) {
        this.name = name;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    
    
}
