package Java.javaPOO.Npolimorfismo.teste;

import Java.javaPOO.Npolimorfismo.dominio.Computador;
import Java.javaPOO.Npolimorfismo.dominio.Tomate;
import Java.javaPOO.Npolimorfismo.servico.CalculadoraTaxa;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC10i7", 7000);
        Tomate tomate = new Tomate("Cereja", 10);

        CalculadoraTaxa.calcularTaxaComputador(computador);
        System.out.println("-------------------");
        CalculadoraTaxa.calcularTaxaTomate(tomate);
    }
}
