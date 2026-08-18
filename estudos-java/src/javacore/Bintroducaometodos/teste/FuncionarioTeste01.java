package javacore.Bintroducaometodos.teste;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João";
        funcionario.idade = 23;
        funcionario.salarios = new double[] {1200, 987.32, 2000};

        funcionario.imprime();
        funcionario.mediaSalarial();
    }
}
