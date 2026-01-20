package academy.devnunes.marratonajava.javacore.introducaoclasses.test;

import academy.devnunes.marratonajava.javacore.introducaoclasses.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        //Inicialização padrao dos atributos do objeto
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();
        System.out.println(estudante2.name); //Null
        System.out.println(estudante2.age); // 0
        System.out.println(estudante2.sex); //Espaço em branco

    }
}
