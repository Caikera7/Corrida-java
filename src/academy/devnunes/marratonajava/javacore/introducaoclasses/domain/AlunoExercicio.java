package academy.devnunes.marratonajava.javacore.introducaoclasses.domain;

public class AlunoExercicio {
    public String name;
    public double notaPortugues;
    public double notaMatematica;

    //criação do constror
    public AlunoExercicio(String name, double notaPortugues, double notaMatematica){
        this.name = name;
        this.notaMatematica = notaMatematica;
        this.notaPortugues = notaPortugues;
    }
}
