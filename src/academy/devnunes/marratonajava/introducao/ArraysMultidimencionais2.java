package academy.devnunes.marratonajava.introducao;
 
public class ArraysMultidimencionais2 {
    public static void main(String[] args) {
        int[][] arrInt = new int[3][];

        //Inicialização de Array Multidimencionais
        arrInt[0] = new int[2];
        arrInt[1] = new int[3];
        arrInt[2] = new int[4];

        for(int[] arrBase: arrInt){
            for(int num: arrBase){
                System.out.println(num);
            }
        }
    }
}
