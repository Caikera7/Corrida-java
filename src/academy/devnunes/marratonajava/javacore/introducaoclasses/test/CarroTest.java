package academy.devnunes.marratonajava.javacore.introducaoclasses.test;

import academy.devnunes.marratonajava.javacore.introducaoclasses.domain.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro car = new Carro();
        Carro carNew = new Carro();

        car.name = "Corolla";
        car.model = "Hybrido";
        car.year = 2005;

        carNew.name = "Bmw";
        carNew.model = "Sport";
        carNew.year = 2020;

        car = carNew; //Referencia de Objetos 

        System.err.println("\nCarro Primeira tabela");
        System.err.println("Nome" + car.name);
        System.err.println( "Modelo" + car.model);
        System.err.println("Ano" + car.year);

        System.err.println("\nCarro Segunda tabela");
        System.err.println("Nome" + carNew.name);
        System.err.println("Moldelo" + carNew.model);
        System.err.println("Ano" + carNew.year);
    }
}
