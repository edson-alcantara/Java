package Java.javaPOO.Gassociacao.teste;

import Java.javaPOO.Gassociacao.dominio.Jogador;

public class JoagadorTeste01 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Romário");
        Jogador jogador2 = new Jogador("Ronaldo");
        Jogador jogador3 = new Jogador("Ronaldinho");
        Jogador[]  jogadores = {jogador1 ,jogador2 ,jogador3};

        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
