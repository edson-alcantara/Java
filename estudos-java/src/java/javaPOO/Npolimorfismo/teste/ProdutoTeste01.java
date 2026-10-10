package java.javaPOO.Npolimorfismo.teste;

import java.javaPOO.Npolimorfismo.dominio.Computador;
import java.javaPOO.Npolimorfismo.dominio.Televisao;
import java.javaPOO.Npolimorfismo.dominio.Tomate;
import java.javaPOO.Npolimorfismo.servico.CalculadoraTaxa;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 7000);
        Televisao tv = new Televisao("LG", 3000);
        Tomate tomate = new Tomate("Cereja", 10);

        CalculadoraTaxa.calcularTaxa(computador);
        System.out.println("-------------------");
        CalculadoraTaxa.calcularTaxa(tomate);
        System.out.println("-------------------");
        CalculadoraTaxa.calcularTaxa(tv);
    }
}
