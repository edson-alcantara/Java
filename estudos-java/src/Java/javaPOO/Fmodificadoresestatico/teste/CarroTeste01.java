package Java.javaPOO.Fmodificadoresestatico.teste;

import Java.javaPOO.Fmodificadoresestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("Audi", 290);

        Carro.velocidadeLimite = 280;

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
