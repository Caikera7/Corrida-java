package academy.devnunes.marratonajava.introducao;

public class Arrays2 {
    public static void main(String[] args){
        String[] names = new String[3];
        names[0] = "Dev Nunes";
        names[1] = "O melhor versionamento de Java do Brasil";
        names[2] = "Futuro Brilhante";

        for (int i = 0; i < names.length; i++){
            System.out.println("Names " + i + ": " + names[i]);
        }
    }
}
