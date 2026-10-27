package javaPOO.Aula05blocosinicializacao.teste;

import javaPOO.Aula05blocosinicializacao.dominio.Anime;

public class AnimeTeste01 {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio : anime.getEpisodios()) {
            System.out.print(episodio + " ");
        }

    }
}
