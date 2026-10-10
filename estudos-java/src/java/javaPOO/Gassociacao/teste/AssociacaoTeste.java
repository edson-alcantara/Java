package estudos.javaPOO.Gassociacao.teste;

import estudos.javaPOO.Gassociacao.dominio.Aluno;
import estudos.javaPOO.Gassociacao.dominio.Local;
import estudos.javaPOO.Gassociacao.dominio.Professor;
import estudos.javaPOO.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das Rosas");
        Aluno aluno = new Aluno("João", 17);
        Professor professor = new Professor("Maria", "java");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("POO", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
