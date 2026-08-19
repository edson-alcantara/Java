package Java.javaPOO.Bintroducaometodos.teste;

import Java.javaPOO.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("João");
        funcionario.setIdade(24);
        funcionario.setSalarios(new double[] {1200, 987.32, 2000});

        funcionario.imprime();
        funcionario.mediaSalarial();
        System.out.println("Média: " + funcionario.getMedia());
    }
}
