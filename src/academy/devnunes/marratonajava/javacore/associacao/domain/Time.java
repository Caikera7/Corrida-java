package academy.devnunes.marratonajava.javacore.associacao.domain;

public class Time {
    private String name;
    private Jogador[] jogadores;

    
    public Time(String name) {
        this.name = name;
    }

    
    public Time(String name, Jogador[] jogadores) {
        this.name = name;
        this.jogadores = jogadores;
    }


    public void imprime(){
        System.out.println(this.name);
        if (jogadores == null) {
            return;
        }
        for (Jogador jgr : jogadores) {
            System.out.println(jgr.getName());
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    public Jogador[] getJogadores() {
        return jogadores;
    }


    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    
}
