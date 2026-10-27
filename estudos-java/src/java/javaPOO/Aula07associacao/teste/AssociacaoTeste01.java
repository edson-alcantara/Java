package javaPOO.Aula07associacao.teste;

import javaPOO.Aula07associacao.dominio.Aluno;
import javaPOO.Aula07associacao.dominio.Local;
import javaPOO.Aula07associacao.dominio.Professor;
import javaPOO.Aula07associacao.dominio.Seminario;

public class AssociacaoTeste01 {
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
