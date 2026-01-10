package academy.devnunes.marratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, lang, boolean
        int age = 10; //4 bytes 
        long numberLarge = 200000; //8 bytes
        double salaryDouble = 2000; // 8bytes
        float salaryFloat = (float) 2500.0D; // forçando o tipo da variavel para ela mesma (4 bytes)
        byte ageByte = 20; // 1 byte 
        short ageShort = 65; // 2bytes
        boolean correct = true; // 1 bit
        boolean incorrect = false; // 1 bit
        char caractere = 56; // 2 bytes (tabela ascii e Unicode)

        // Strings classe
        String name = " Cayque";
        var name2 = "Nunes ";
        System.out.println(age);
        System.out.println(correct);
        System.out.println(incorrect);
        System.out.println("char "+ caractere);
        System.out.println("Hi my name is" + name);

        //Relacionais 
        boolean isAdult = age >= 18;
        System.out.println("É adulto? " + isAdult);
        boolean isMinor = age < 18;
        System.out.println("É menor de idade? " + isMinor);
        boolean canVote = isAdult || age == 16;
        System.out.println("Pode votar? " + canVote);
        boolean canNotVote != canVote;
        System.out.println("Não pode votar? " + canNotVote);


        //Logicos 
        int age = 30;
        float salary = 3500F;
        boolean isWithinTheLawToBeOverThirty = age > 30 && salary >= 4612;
        System.out.println("Is within the law to be over thirty? " + isWithinTheLawToBeOverThirty);
        boolean isWithinTheLawToBeUnderThirty = age < 30 && salary >= 3381;
        System.out.println("Is within the law to be under thirty? " + isWithinThe   LawToBeUnderThirty);

        double currentAccount = 300;0;
        double savingsAccount = 10000;
        float valuePlayStation = 5000F;

        boolean isPlayStationPurchasable = currentAccount > valuePlayStation || savingsAccount > valuePlayStation;
        System.out.println("Is PlayStation purchasable? " + isPlayStationPurchasable);

        //Atribuição
        double bonus = 1800;
        bonus += 1000; // bonus = bonus + 1000
        System.out.println(bonus);
        bonus -= 1000; // bonus = bonus - 1000
        System.out.println(bonus);
        bonus *= 2; // bonus = bonus * 2    
        System.out.println(bonus);
        bonus /= 2; // bonus = bonus / 2
        System.out.println(bonus);
        bonus %= 2; // bonus = bonus % 2
        System.out.println(bonus);

        //Incrementos e Decrementos
        int increment = 0;
        increment++; 
        System.out.println(increment);
        increment--;
        System.out.println(increment);

        //Quando o incremento estiver na frente o valor é somado antes de ser usado & quando estiver atrás o valor é somado depois de ser usado (increment++ / ++increment)
    }
}   
