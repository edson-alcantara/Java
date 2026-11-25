package javaPOO.aula07associacao.teste;

import javaPOO.aula07associacao.dominio.Jogador;
import javaPOO.aula07associacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldinho");
        Time time = new Time("Brasil");

        jogador1.setTime(time);

        jogador1.imprime();
    }
}
