package Java.javaPOO.Csobrecargametodos.teste;

import Java.javaPOO.Csobrecargametodos.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Bleach", "Tv", 12, "Ação");

        anime.imprime();
    }
}
