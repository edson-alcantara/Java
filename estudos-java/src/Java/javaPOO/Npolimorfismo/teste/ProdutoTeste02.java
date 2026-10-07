package Java.javaPOO.Npolimorfismo.teste;

import Java.javaPOO.Npolimorfismo.dominio.Computador;
import Java.javaPOO.Npolimorfismo.dominio.Produto;
import Java.javaPOO.Npolimorfismo.dominio.Tomate;

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
