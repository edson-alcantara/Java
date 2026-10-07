package Java.javaPOO.Npolimorfismo.servico;

import Java.javaPOO.Npolimorfismo.dominio.Computador;
import Java.javaPOO.Npolimorfismo.dominio.Tomate;

public class CalculadoraTaxa {
    public static void calcularTaxaComputador(Computador computador){
        System.out.println("Relatório de taxa do computador");
        double taxa = computador.calcularTax();
        System.out.println("Computador: " + computador.getNome());
        System.out.println("Valor: " + computador.getValor());
        System.out.println("Taxa a ser pago: " + taxa);
    }

    public static void calcularTaxaTomate(Tomate tomate){
        System.out.println("Relatório de taxa do tomate");
        double taxa = tomate.calcularTax();
        System.out.println("Computador: " + tomate.getNome());
        System.out.println("Valor: " + tomate.getValor());
        System.out.println("Taxa a ser pago: " + taxa);
    }
}
