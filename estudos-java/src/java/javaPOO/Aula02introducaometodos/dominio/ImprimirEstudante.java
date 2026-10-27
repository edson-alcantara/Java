package javaPOO.Aula02introducaometodos.dominio;

public class ImprimirEstudante {
    public void imprime(Estudante estudante){
        System.out.println("------------------");

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
