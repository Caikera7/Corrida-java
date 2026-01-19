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

        //Exercício de laços de repetição para somar números pares de 0 a 100
        int sum = 0;
        for (int i = 0; i <= 100; i++){
            if (i % 2 == 0){
                sum += i;
            }
        }
        System.out.println("A soma dos números pares de 0 a 100 é: " + sum);


        //Exercício lidando com BREAK em laços de repetição
        double totalValue = 30000;
        for( int installment = 1; installment <= totalValue; installment++){
            double valuePerInstallment = totalValue / installment;
            if(valuePerInstallment < 1000){
                break;
            }
            System.out.println("Número de parcelas: " + installment + " - Valor de cada parcela: R$ " + valuePerInstallment);
        }

        //Exercício lidando com CONTINUE em laços de repetição
        double valorTotal = 5000;
        for(int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorPorParcela = valorTotal / parcela;
            if(valorPorParcela < 1000){
                continue;
            }
            System.out.println("Número de parcelas: " + parcela + " - Valor de cada parcela: R$ " + valorPorParcela);
        }

        //Pequeno Exercício para aprendizado de Inicialização e manipulção de Array Multidimencionais (Exercício mostrando data e hora)
        int[][] dateAndHours = {{18,01,2026},{20,50}};

        for(int i = 0; i < dateAndHours.length;i++){
            System.err.println("--------------");
            for (int j = 0; j < dateAndHours[i].length; j++) {
                System.out.println(dateAndHours[i][j]);
            }
        }
  }
}
