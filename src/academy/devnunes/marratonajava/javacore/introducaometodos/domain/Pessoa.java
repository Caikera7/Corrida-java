package academy.devnunes.marratonajava.javacore.introducaometodos.domain;

public class Pessoa {
    
    //Acoplamento 
    private String name;
    private int age;

    public void SetName(String name){
        this.name = name;
    }

    public void SetAge(int age){
        if (age < 0){
            System.out.println("Idade invalida!");
            return;
        }
        this.age = age;
    }

    public String GetName(){
        return this.name;
    }

    public int GetAge(){
        return this.age;
    }
}
