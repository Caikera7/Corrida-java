package academy.devnunes.marratonajava.introducao;

public class Aritimeticos {
    //Operadores 
    public static void main(String[] args) {
        int number1 = 10;
        int number2 = 20;
        double number3 = 15.5;
        double number4 = 7.5;

        double sum = number1 + number2; //adição
        double subtraction = number2 - number1; //subtração
        double multiplication = number1 * number2; //multiplicação
        double division = number2 / number1; //divisão
        double module = 21 % 7; //resto da divisão

        System.out.println("Soma: " + sum); 
        System.out.println("Subtração: " + subtraction);
        System.out.println("Multiplicação: " + multiplication); 
        System.out.println("Divisão: " + division);
        System.out.println("Módulo: " + module); 

        double sum2 = number3 + number4;
        System.out.println("Soma2: " + sum2);
    }       
}
