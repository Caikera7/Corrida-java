package academy.devnunes.marratonajava.javacore.introducaometodos.domain;

public class Calculadora {
    
    //sem retorno
    public void sum(){
        System.out.println(10 + 10);
    }

    public void subtraction(){
        System.out.println(34-3);
    }

    //metodos com parâmetros
    public void multiplication(int number, int number2){
        System.out.println(number * number2);
    }

    public double toDivide (double numOne, double numTwo){
        return numOne/numTwo;
    }

    //Outra forma de retorno
      public double division (double numOne, double numTwo){
        if(numTwo == 0){
            return 0;
        } else {
            return numOne/numTwo;
        }
    }
      public void printing (double numOne, double numTwo){
        
    }
}
