package Java.javaPOO.Aintroducaoclasses.teste;

import Java.javaPOO.Aintroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.name = "Juarez";
        professor.idade = 60;
        professor.sexo = 'M';

        System.out.println("Nome:" + professor.name + " " + "Idade:" + professor.idade + " " + "Sexo:" + professor.sexo);
    }
}
