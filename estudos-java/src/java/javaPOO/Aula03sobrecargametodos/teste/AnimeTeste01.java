package javaPOO.Aula03sobrecargametodos.teste;

import javaPOO.Aula03sobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Bleach", "Tv", 12, "Ação");

        anime.imprime();
    }
}
