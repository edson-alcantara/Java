package pratica.teste;

import pratica.dominio.Combate;
import pratica.dominio.Lutador;

public class LutadorTeste01 {
    public static void main(String[] args){
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Birubiru", "Brasil", 31, 1.75,
                68.9, 11, 3, 1);

        l[1] = new Lutador("Babidi", "Japão", 43, 1.68,
                55, 3, 6, 2);

        l[2] = new Lutador("Jose Aldo", "Brasil", 35, 1.65,
                71, 12, 3, 2);

        l[3] = new Lutador("JonJones", "EUA", 30, 1.93,
                103, 13, 0, 1);

        l[4] = new Lutador("John Wick", "Russia", 40, 1.86,
                81, 18, 0, 0);

        l[5] = new Lutador("Brutos", "EUA", 32, 1.81,
                110, 5, 4, 3);


        Combate UEC01 = new Combate();
        UEC01.marcarLuta(l[0], l[1]);
        UEC01.lutar();
        l[0].status();
        l[1].status();


    }
}
