package academy.devnunes.marratonajava.introducao;

public class ArraysMultidimencionais {
    public static void main (String[] args){
        //Um arrays dentro de outro Array
        int[][] day = new int[3][3];
        day[0][0] = 31; 
        day[0][1] = 28; 
        day[0][2] = 20; 
        System.out.println(day[0][0]);

        day[1][0] = 15; 
        day[1][1] = 30; 
        day[1][2] = 28;
        
        for(int i = 0; i < day.length; i++){
            for(int j = 0; j <day[i].length; j++){
                System.out.println(day[i][j]);
            }
        }

        //Usando o foreach no Arrays Multidimencionais
        System.out.println("----------------------------");

        for(int[] arr: day   ){
            for(int num:arr) {
                System.out.println(num);
            }
        }
    }
}
