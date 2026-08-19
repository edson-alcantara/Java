package Java.javaPOO.Bintroducaometodos.teste;

import Java.javaPOO.Bintroducaometodos.dominio.Estudante;
import Java.javaPOO.Bintroducaometodos.dominio.ImprimirEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        ImprimirEstudante impressora = new ImprimirEstudante();

        estudante1.nome = "João";
        estudante1.idade = 15;
        estudante1.sexo = 'M';

        estudante2.nome = "Maria";
        estudante2.idade = 17;
        estudante2.sexo = 'F';

        impressora.imprime(estudante1);

        impressora.imprime(estudante2);
    }
}
