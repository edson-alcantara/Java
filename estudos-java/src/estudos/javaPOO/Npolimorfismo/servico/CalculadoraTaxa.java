package estudos.javaPOO.Npolimorfismo.servico;

import estudos.javaPOO.Npolimorfismo.dominio.Produto;

public class CalculadoraTaxa {
        public static void calcularTaxa(Produto produto){
            System.out.println("Relatório de taxa");
            double taxa = produto.calcularTax();
            System.out.println("Produto: " + produto.getNome());
            System.out.println("Preço: " + produto.getValor());
            System.out.println("Taxa a ser paga: " + taxa);
        }
}
