package academy.devnunes.marratonajava.javacore.blocosinicializacao.domain;

public class Manga {
    private String name;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10};

    //bloco de Iniciaçização de criação do objeto 
    {
        for(int ep: this.episodios){
            System.out.println(ep + " ");
        }

    }

    public Manga(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }

    
  
}
