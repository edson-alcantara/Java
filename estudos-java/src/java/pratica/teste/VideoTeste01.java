package pratica.teste;

import pratica.projetoyoutube.Usuario;
import pratica.projetoyoutube.Video;

public class VideoTeste01 {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 01 de Encapsulamento");
        v[1] = new Video("Aula 02 de Herança");
        v[2] = new Video("Aula 03 de Polimorfismo");

        Usuario u[] = new Usuario[2];
        u[0] = new Usuario("Pedro", 22, "M", "paçoca");
        u[1] = new Usuario("Maria", 23, "F", "jujuba");

        System.out.println(v[0].toString());
        System.out.println("----------------------");
        System.out.println(v[1].toString());
        System.out.println("----------------------");
        System.out.println(v[2].toString());
        System.out.println("-----------------------");
        System.out.println(u[0].toString());
        System.out.println("-----------------------");
        System.out.println(u[1].toString());
    }
}
