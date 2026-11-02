package pratica.teste;

import pratica.dominio.ControleRemoto;

public class ControleRemotoTeste01 {
    public static void main(String[] args) {
        ControleRemoto c =  new ControleRemoto();

        c.maisVolume();
        c.ligarMudo();
        c.play();
        c.abrirMenu();

    }
}
