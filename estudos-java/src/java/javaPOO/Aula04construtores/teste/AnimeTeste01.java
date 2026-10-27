package javaPOO.Aula04construtores.teste;

import javaPOO.Aula04construtores.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Bleach", "Tv", 12, "Ação", "A1");

        anime.imprime();
    }
}
