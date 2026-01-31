package academy.devnunes.marratonajava.javacore.introducaometodos.domain;

public class Funcionario {
    private String name;
    private int age;
    private double[] salary;

    public Funcionario(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void imprime() {
        System.out.println(this.name);
        System.out.println(this.age);
        if (salary == null) {
            return;
        }
        for (double money : salary) {
            System.out.println(money + " ");
        }
    }

    public void MediaSalarial() {
        if (salary == null) {
            return;
        }
        double media = 0;
        for (double cash : salary) {
            media += cash;
        }
        media /= salary.length;
        System.out.println("Media salarial " + media);

    }

    public void SetSalary(double[] salary){
        this.salary = salary;
    }

    public void SetAge(int age){
        this.age = age;
    }

    public void SetName(String name){
        this.name = name;
    }

    public double[] GetSalary(){
        return salary;
    }

    public int GetAge(){
        return age;
    }

    public String GetName(){
        return name;
    }
}
