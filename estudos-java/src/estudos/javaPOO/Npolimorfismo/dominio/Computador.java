package estudos.javaPOO.Npolimorfismo.dominio;

public class Computador extends Produto {
    public static final double TAXA_POR_CENTO = 0.21;
    public Computador(String nome, double valor) {
        super(nome, valor);
    }



    @Override
    public double calcularTax() {
        System.out.println("Calculando taxa do computador");
        return this.valor * TAXA_POR_CENTO;
    }
}
