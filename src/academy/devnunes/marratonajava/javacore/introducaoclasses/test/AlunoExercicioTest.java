package academy.devnunes.marratonajava.javacore.introducaoclasses.test;

import academy.devnunes.marratonajava.javacore.introducaoclasses.domain.AlunoExercicio;


public class AlunoExercicioTest {
    public static void main(String[] args) {
        
        //Inicialização por parametros 
        AlunoExercicio students = new AlunoExercicio("João", 7.0, 8.0);
        AlunoExercicio studentsSegundary = new AlunoExercicio("Pedro", 3.0, 5.0);
        AlunoExercicio studentsTerciary = new AlunoExercicio("Henrique", 8.0, 8.0);
        

        AlunoExercicio[] listaAluno = {students, studentsSegundary, studentsTerciary};

        for(int i = 0; i < listaAluno.length; i++){
            System.out.println("Nome do aluno: " + listaAluno[i].name);
        }
    }
}
