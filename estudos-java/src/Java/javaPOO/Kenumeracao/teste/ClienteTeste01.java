package Java.javaPOO.Kenumeracao.teste;

import Java.javaPOO.Kenumeracao.dominio.Cliente;
import Java.javaPOO.Kenumeracao.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("João", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Maria", TipoCliente.PESSOA_JURIDICA );
        Cliente cliente3 = new Cliente("Pedro", TipoCliente.PESSOA_FISICA );
        Cliente cliente4 = new Cliente("Juliana", TipoCliente.PESSOA_JURIDICA );

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
    }
}
