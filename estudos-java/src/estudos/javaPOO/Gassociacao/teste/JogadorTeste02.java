package estudos.javaPOO.Gassociacao.teste;

import estudos.javaPOO.Gassociacao.dominio.Jogador;
import estudos.javaPOO.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldinho");
        Time time = new Time("Brasil");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
