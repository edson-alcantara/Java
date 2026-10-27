package javaPOO.Aula08heranca.teste;

import javaPOO.Aula08heranca.dominio.Endereco;
import javaPOO.Aula08heranca.dominio.Funcionario;
import javaPOO.Aula08heranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("12335-36");
        Pessoa pessoa = new Pessoa("João");

        pessoa.setCpf("109369478-85");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("----------------");

        Funcionario funcionario = new Funcionario("Maria");
        funcionario.setCpf("1313115");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
