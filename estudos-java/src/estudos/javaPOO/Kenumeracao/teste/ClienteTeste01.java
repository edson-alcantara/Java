package estudos.javaPOO.Kenumeracao.teste;

import estudos.javaPOO.Kenumeracao.dominio.Cliente;
import estudos.javaPOO.Kenumeracao.dominio.TipoCliente;
import estudos.javaPOO.Kenumeracao.dominio.TipoPagamento;

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
