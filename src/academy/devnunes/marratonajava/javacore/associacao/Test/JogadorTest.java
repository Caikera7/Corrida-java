package academy.devnunes.marratonajava.javacore.associacao.Test;


import academy.devnunes.marratonajava.javacore.associacao.domain.Jogador;
import academy.devnunes.marratonajava.javacore.associacao.domain.Time;

public class JogadorTest {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Neymar");
        Time time = new Time("Brasil");
        Jogador[] jogadores = {jogador};

        jogador.setTime(time);

        time.setJogadores(jogadores);

        System.out.println("----Jogador----");

        jogador.imprime();

        System.out.println("----Time----");

        time.imprime();
        
    }
}
