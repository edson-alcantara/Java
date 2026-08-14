package javacore.Aintroducaoclasses.teste;

import javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Juarez";
        professor.idade = 65;
        professor.sexo = 'M';

        System.out.println("Nome:" + professor.nome + " " + "Idade:" + professor.idade + " " + "Sexo:" + professor.sexo);
    }
}
