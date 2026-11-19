package pratica.teste;


import pratica.dominio.Aluno;
import pratica.dominio.Bolsista;
import pratica.dominio.Pessoa;
import pratica.dominio.Visitante;

public class PessoaTesta01 {
    public static void main(String[] args){
        Visitante v1 = new Visitante();
        Aluno a1 = new Aluno();

        v1.setNome("Joao");
        v1.setIdade(23);
        v1.setSexo("M");

        a1.setNome("Pedro");
        a1.setIdade(16);
        a1.setSexo("M");

        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();

        b1.setNome("Maria");
        b1.setIdade(23);
        b1.setSexo("F");

        b1.renovarBolsa();
        b1.pagarMensalidade();
    }
}
