package academy.devnunes.marratonajava.introducao;

public class ExerciciosGerais {
    
    public static void main(String[] args) {
        
        //Exercício para cálculo de imposto de renda anual 
        double salaryAnnual = 120000;
        double primaryTax = 9.70 / 100;
        double secondaryTax = 37.35 / 100;
        double tertiaryTax = 49.50 / 100;
        double taxAmount;

        if(salaryAnnual <= 34712){
            taxAmount = salaryAnnual * primaryTax;
            System.out.println("O valor do imposto de renda anual é de: R$ " + taxAmount);
        } else if (salaryAnnual > 34712 && salaryAnnual <= 68507){
            taxAmount = salaryAnnual * secondaryTax;
            System.out.println("O valor do imposto de renda anual é de: R$ " + taxAmount);
        } else {
            taxAmount = salaryAnnual * tertiaryTax;
            System.out.println("O valor do imposto de renda anual é de: R$" + taxAmount);
        }


        //Exercício switch case para dias da semana, agrupando final de semana e dias de semana mais funcional 
        byte day = 5;
        switch (day){
           case 1:
           case 7:
                System.out.println("Final de semana");
                break;
           case 2:
           case 3:
           case 4:
           case 5:
           case 6:
                System.out.println("Dia de semana");
                break;     
        }

  }
}
