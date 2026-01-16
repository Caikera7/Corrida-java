package academy.devnunes.marratonajava.introducao;

public class Arrays3 {
    public static void main(String[] args){
        int numbers[] = new int[3]; 
        int numbers2[] = {1, 2, 3, 4, 5, 6}; //Forma simplificada de inicializar
        int numbers3[] = new int[]{7, 8, 9, 10}; //Outra forma de inicializar

        for (int i:numbers2){
            System.out.println("Number 2: " + i); //Usando o for each, versão mais simples do for, se precisar o indice não ira funcionar, ele está incrementando automaticamente.
        }
    }
}
