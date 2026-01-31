package academy.devnunes.marratonajava.javacore.sobrecargametodos.domain;

//SobreCargaMetodos
public class Anime {
    private String name;
    private String tipo;
    private int ep;
    private String genero;

    public void init(String name, String tipo, int ep){
        this.name = name;
        this.tipo = tipo;
        this.ep = ep;
    }

    public void init(String name, String tipo, int ep, String genero){
        this.init(name, tipo, ep);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println(this.tipo);
        System.out.println(this.ep);
        System.out.println(this.genero);
    }



    //get e set (pegar e modificar)

    public void setGenero(String genero){
        this.genero = genero;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setEp(int ep){
        this.ep = ep;
    }




    public String getName(){
        return name;
    }

    public String getGenero(){
        return genero;
    }

    public String getTipo(){
        return tipo;
    }

    public int getEp(){
        return ep;
    }
}
