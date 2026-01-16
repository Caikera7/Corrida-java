package academy.devnunes.marratonajava.introducao;

public class Arrays {
    public static void main(String[] args){

        int [] ages = new int[3];
        ages[0] = 21;
        ages[1] = 24;
        ages[2] = 19;
        System.out.println("Age 1: " + ages[0]);
        System.out.println("Age 2: " + ages[1]);
        System.out.println("Age 3: " + ages[2]);

        //Valores padrões em arrays, para cada tipo primitivo
        float [] name = new float[3];
        System.out.println("Name 1: " + name[0]);
        System.out.println("Name 2: " + name[1]);   
        System.out.println("Name 3: " + name[2]);

        //Exemplos de padrões 
        boolean [] trueOrFalse = new boolean[3];
        System.out.println("TrueOrFalse 1: " + trueOrFalse[0]);
        System.out.println("TrueOrFalse 2: " + trueOrFalse[1]);
        System.out.println("TrueOrFalse 3: " + trueOrFalse[2]);

        //Mais exemplos de padrões
        byte [] bytes = new byte[3];
        System.out.println("Bytes 1: " + bytes[0]); 
        System.out.println("Bytes 2: " + bytes[1]);
        System.out.println("Bytes 3: " + bytes[2]);

        //Byte, short, int, long, float, double = 0
        //char = '\u0000'
        //boolean = false
        //String = null
    }
}
