package pratica.teste;

import pratica.dominio.Aluno;
import pratica.dominio.Funcionario;
import pratica.dominio.Pessoa;
import pratica.dominio.Professor;

public class PessoaTesta01 {
    public static void main(String[] args){
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("João Paulo");
        p2.setNome("Pedro Paulo");
        p3.setNome("Maria Helena");
        p4.setNome("Suellen Liliane");

        p1.setIdade(18);
        p2.setIdade(20);
        p3.setIdade(25);
        p4.setIdade(23);

        p1.setSexo("M");
        p2.setSexo("M");
        p3.setSexo("F");
        p4.setSexo("F");

        p2.setCurso("Java");
        p3.setSalario(2500);
        p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
