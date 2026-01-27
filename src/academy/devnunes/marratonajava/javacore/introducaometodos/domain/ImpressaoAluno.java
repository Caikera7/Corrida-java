package academy.devnunes.marratonajava.javacore.introducaometodos.domain;

public class ImpressaoAluno {
    public void imprime(Aluno student){
        System.out.println(student.name); 
        System.out.println(student.age); 
        System.out.println(student.notice);
        
    }
}
