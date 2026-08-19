package Java.javaPOO.Bintroducaometodos.teste;

import Java.javaPOO.Bintroducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Pedro";
        //pessoa.idade = 29;
        pessoa.setNome("Maria");
        pessoa.setIdade(30);

        pessoa.imprimir();
    }
}
