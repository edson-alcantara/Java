package javaPOO.Aula07associacao.teste;

import javaPOO.Aula07associacao.dominio.Jogador;
import javaPOO.Aula07associacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Pelé");
        Time time = new Time("Brasil");
        Jogador[]  jogadores = {jogador};

        jogador.setTime(time);
        time.setJogadores(jogadores);

        System.out.println("----Jogador----");
        jogador.imprime();
        System.out.println("----Time----");
        time.imprime();
    }
}
