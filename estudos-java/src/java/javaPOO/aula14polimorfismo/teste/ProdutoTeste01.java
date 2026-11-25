package javaPOO.aula14polimorfismo.teste;

import javaPOO.aula14polimorfismo.dominio.Computador;
import javaPOO.aula14polimorfismo.dominio.Televisao;
import javaPOO.aula14polimorfismo.dominio.Tomate;
import javaPOO.aula14polimorfismo.servico.CalculadoraTaxa;

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
