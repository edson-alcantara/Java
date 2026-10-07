package Java.javaPOO.Npolimorfismo.servico;

import Java.javaPOO.Npolimorfismo.dominio.Computador;
import Java.javaPOO.Npolimorfismo.dominio.Produto;
import Java.javaPOO.Npolimorfismo.dominio.Tomate;

public class CalculadoraTaxa {
        public static void calcularTaxa(Produto produto){
            System.out.println("Relatório de taxa");
            double taxa = produto.calcularTax();
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Preço: " + produto.getValor());
            System.out.println("Taxa a ser paga: " + taxa);
        }
}
