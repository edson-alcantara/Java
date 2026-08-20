package Java.javaPOO.Eblocosinicializacao.teste;

import Java.javaPOO.Eblocosinicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
