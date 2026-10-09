package estudos.javaPOO.Gassociacao.teste;

import estudos.javaPOO.Gassociacao.dominio.Escola;
import estudos.javaPOO.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("João");
        Professor professor2 = new Professor("Maria");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Universo",  professores);

        escola.imprime();
    }
}
