package academy.devnunes.marratonajava.javacore.introducaometodos.domain;

public class Aluno {
    public String name;
    public int age;
    public double notice;

    public void imprime(){
        System.out.println("---------------------");
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.notice);
    }
}
