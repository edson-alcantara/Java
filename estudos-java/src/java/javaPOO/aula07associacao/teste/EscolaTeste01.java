package javaPOO.aula07associacao.teste;

import javaPOO.aula07associacao.dominio.Escola;
import javaPOO.aula07associacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("Maria");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Universo",  professores);

        escola.imprime();
    }
}
