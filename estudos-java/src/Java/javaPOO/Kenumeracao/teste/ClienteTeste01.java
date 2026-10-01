package Java.javaPOO.Kenumeracao.teste;

import Java.javaPOO.Kenumeracao.dominio.Cliente;
import Java.javaPOO.Kenumeracao.dominio.TipoCliente;
import Java.javaPOO.Kenumeracao.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Maria", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.getNomeRelatorio());
        TipoCliente tipoCliente2 = TipoCliente.valueOf("PESSOA_JURIDICA");
        System.out.println(tipoCliente2);
    }
}
