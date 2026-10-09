package estudos.javaPOO.Npolimorfismo.teste;

import estudos.javaPOO.Npolimorfismo.dominio.Computador;
import estudos.javaPOO.Npolimorfismo.dominio.Produto;
import estudos.javaPOO.Npolimorfismo.dominio.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularTax());
        System.out.println("----------------");

        Produto produto2 = new Tomate("Americano", 10);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularTax());
    }
}
