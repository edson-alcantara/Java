package pratica.teste;

import pratica.projetoyoutube.Usuario;
import pratica.projetoyoutube.Video;
import pratica.projetoyoutube.Visualizacao;

public class VideoTeste01 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de Encapsulamento");
        v[1] = new Video("Aula 02 de Herança");
        v[2] = new Video("Aula 03 de Polimorfismo");

        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("Pedro", 22, "M", "paçoca");
        u[1] = new Usuario("Maria", 23, "F", "jujuba");

        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(u[0], v[2]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(u[0], v[1]);
        vis[1].avalair(65.6);
        System.out.println(vis[1].toString());

        /*System.out.println(v[0].toString());
        System.out.println("----------------------");
        System.out.println(v[1].toString());
        System.out.println("----------------------");
        System.out.println(v[2].toString());
        System.out.println("-----------------------");
        System.out.println(u[0].toString());
        System.out.println("-----------------------");
        System.out.println(u[1].toString());*/
    }
}
