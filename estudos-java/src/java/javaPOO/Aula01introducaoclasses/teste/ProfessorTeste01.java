package javaPOO.Aula01introducaoclasses.teste;

import javaPOO.Aula01introducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Juarez";
        professor.idade = 60;
        professor.sexo = 'M';

        System.out.println("Nome:" + professor.nome + " " + "Idade:" + professor.idade + " " + "Sexo:" + professor.sexo);
    }

}
