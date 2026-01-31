package academy.devnunes.marratonajava.javacore.sobrecargametodos.Test;

import academy.devnunes.marratonajava.javacore.sobrecargametodos.domain.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "Mangá", 20, "Ação"); //Iniciaçização com SobreCarga em metodos
        anime.imprime();
    }
}
