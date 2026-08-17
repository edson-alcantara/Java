package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante1.nome = "João";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 16;
        estudante2.sexo = 'F';

        estudante1.imprime();
        estudante2.imprime();
    }
}
