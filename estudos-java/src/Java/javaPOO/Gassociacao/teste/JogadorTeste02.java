package Java.javaPOO.Gassociacao.teste;

import Java.javaPOO.Gassociacao.dominio.Jogador;
import Java.javaPOO.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldinho");
        Time time = new Time("Brasil");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
