package pratica.teste;

import pratica.dominio.Lutador;

public class LutadorTeste01 {
    public static void main(String[] args){
        Lutador l[] = new Lutador[2];

        l[0] = new Lutador("Birubiru", "Brasil", 31, 1.75,
                68.9, 11, 3, 1);

        l[1] = new Lutador("Babidi", "China", 43, 1.68,
                55, 3, 6, 2);



        l[0].apresentar();
        l[1].apresentar();
    }
}
