package Java.javaPOO.Hheranca.teste;

import Java.javaPOO.Hheranca.dominio.Endereco;
import Java.javaPOO.Hheranca.dominio.Funcionario;
import Java.javaPOO.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("12335-36");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("João");
        pessoa.setCpf("109369478-85");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("----------------");

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maria");
        funcionario.setCpf("1313115");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);

        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
