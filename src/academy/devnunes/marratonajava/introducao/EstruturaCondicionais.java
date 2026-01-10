package academy.devnunes.marratonajava.introducao;


public class EstruturaCondicionais {
    
    public static void main(String[] args) {
        //if, else if, else
        int age = 17;
        boolean isAdult = age >= 18; //Deixa seu código mais legível para futuros bugs ou desenvolvedores modificarem
        if(isAdult) {
            System.out.println("É adulto");
        } else {
            System.out.println("Não é adulto");
        }


        //Mais exemplos para aprendizagem
        float salary = 4000F;
        float taxSalary = 0F;
        if(salary < 2000){
            taxSalary = 0F;
        } else if (salary >= 2000 && salary < 4000){
            taxSalary = salary * 0.15F;
        } else {
            taxSalary = salary * 0.20F;
        }
        System.out.println("O imposto de renda é de: R$ " + taxSalary);
    }
    
    //Exercício de estrutura condicional (else if)
    int ageOfSoccerPlayer = 15;
    if(ageOfSoccerPlayer >= 10 && ageOfSoccerPlayer < 16){
        System.out.println("Categoria Infantil");
    } else if(ageOfSoccerPlayer >= 16 && ageOfSoccerPlayer < 18){
        System.out.println("Categoria Juvenil");
    } else if(ageOfSoccerPlayer >= 18 && ageOfSoccerPlayer < 20){
        System.out.println("Categoria Adulto");
    } else if(ageOfSoccerPlayer >= 20 && ageOfSoccerPlayer < 30){
        System.out.println("Categoria Profissional");
    } else if(ageOfSoccerPlayer >= 30){
        System.out.println("Aposentado!");
    } else {
        System.out.println("Idade inválida!");
    }
}

