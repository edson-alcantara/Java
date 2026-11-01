package pratica.teste;

import pratica.dominio.ContaBanco;

public class ContaBancoTeste01 {
    public static void main(String[] args) {
        ContaBanco conta01 = new ContaBanco();
        ContaBanco conta02 = new ContaBanco();
        conta01.setNumConta(1234);
        conta01.setDono("João");
        conta01.abrirConta("CC");

        conta02.setNumConta(4321);
        conta02.setDono("Maria");
        conta02.abrirConta("CP");

        conta01.depositar(100);
        conta02.depositar(200);

        conta01.sacar(100);
        conta02.sacar(200);

        conta01.estadoAtual();
        conta02.estadoAtual();
    }
}
