package academy.devnunes.marratonajava.javacore.construtores.Test;

import academy.devnunes.marratonajava.javacore.construtores.domain.Desenhos;

public class DesenhoTest {
   public static void main(String[] args) {
      Desenhos desenhos = new Desenhos("Lego", "tv", 20, "drama");

      desenhos.imprime();

   }
}
