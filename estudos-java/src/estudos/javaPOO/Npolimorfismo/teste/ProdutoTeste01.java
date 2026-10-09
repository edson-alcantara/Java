package estudos.javaPOO.Npolimorfismo.teste;

import estudos.javaPOO.Npolimorfismo.dominio.Computador;
import estudos.javaPOO.Npolimorfismo.dominio.Televisao;
import estudos.javaPOO.Npolimorfismo.dominio.Tomate;
import estudos.javaPOO.Npolimorfismo.servico.CalculadoraTaxa;

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
