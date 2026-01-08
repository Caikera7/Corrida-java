package academy.devnunes.marratonajava.introducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, lang, boolean
        int age = 10; //4 bytes 
        long numberLarge = 200000; //8 bytes
        double salaryDouble = 2000; // 8bytes
        float salaryFloat = 2500.0F; //4 bytes
        byte ageByte = 20; // 1 byte 
        short ageShort = 10; // 2bytes
        boolean correct = true; // 1 bit
        boolean incorrect = false; // 1 bit
        char caractere = 'M'; // 2 bytes (tabela ascii e Unicode)
        System.out.println(age);
        System.out.println(correct);

    }
}   
