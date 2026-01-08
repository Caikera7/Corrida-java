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
        // Strings
        String name = " Cayque";
        var name2 = "Nunes ";
        System.out.println(age);
        System.out.println(correct);
        System.out.println(incorrect);
        System.out.println("char "+ caractere);
        System.out.println("Hi my name is" + name);
 
    }
}   
