package Java.javaPOO.Jmodificadorfinal.teste;

import Java.javaPOO.Jmodificadorfinal.dominio.Carro;
import Java.javaPOO.Jmodificadorfinal.dominio.Ferrari;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("João");
        System.out.println(carro.COMPRADOR);
        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Ferrari");
        ferrari.imprime();
    }
}
