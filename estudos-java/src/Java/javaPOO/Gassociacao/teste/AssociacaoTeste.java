package Java.javaPOO.Gassociacao.teste;

import Java.javaPOO.Gassociacao.dominio.Aluno;
import Java.javaPOO.Gassociacao.dominio.Local;
import Java.javaPOO.Gassociacao.dominio.Professor;
import Java.javaPOO.Gassociacao.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das Rosas");
        Aluno aluno = new Aluno("João", 17);
        Professor professor = new Professor("Maria", "Java");
        Aluno[] alunosParaSeminario = {aluno};

        Seminario seminario = new Seminario("POO", alunosParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};

        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();
    }
}
