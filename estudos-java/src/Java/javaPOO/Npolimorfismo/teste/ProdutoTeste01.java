package Java.javaPOO.Npolimorfismo.teste;

import Java.javaPOO.Npolimorfismo.dominio.Computador;
import Java.javaPOO.Npolimorfismo.dominio.Televisao;
import Java.javaPOO.Npolimorfismo.dominio.Tomate;
import Java.javaPOO.Npolimorfismo.servico.CalculadoraTaxa;

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
