package Java.javaPOO.Lclassesabstratas.teste;

import Java.javaPOO.Lclassesabstratas.dominio.Desenvolvedor;
import Java.javaPOO.Lclassesabstratas.dominio.Funcionario;
import Java.javaPOO.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Maria", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Pedro", 4000);
        System.out.println(desenvolvedor);
        System.out.println(gerente);
        gerente.imprime();
        desenvolvedor.imprime();
    }
}
