package javaPOO.Aula02introducaometodos.teste;

import javaPOO.Aula02introducaometodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        //pessoa.nome = "Pedro";
        //pessoa.idade = 29;
        pessoa.setNome("Maria");
        pessoa.setIdade(25);

        pessoa.imprimir();
    }
}
