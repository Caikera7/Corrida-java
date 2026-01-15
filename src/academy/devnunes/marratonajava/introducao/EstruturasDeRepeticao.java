package academy.devnunes.marratonajava.introducao;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        //while
        int count = 0;
        while (count < 10){
            System.out.println("Contador: " + count);
            count++;
        }

        //Estrutura de repetição do-while
        do{
            System.out.println("Contador do-while: " + count);
            count++;
        } while (count < 10);

        
        //Estrutura de repetição for

        for (int i = 0; i < 10; i++){
            System.out.println("Contador for: " + i);
        }
        

        //Lidando com break em laços de repetição
        int valueMax = 50;
        for( int i = 0; i <= valueMax; i++){
            if(i > 25){
                break;
            }
            System.out.println("Valor de i: " + i);
        }

        //Lindando com continue em laços de repetição
        for( int i = 0; i <= valueMax; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println("Valor ímpar de i: " + i);
        }
    }
}
