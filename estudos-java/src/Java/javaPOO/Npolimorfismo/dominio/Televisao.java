package Java.javaPOO.Npolimorfismo.dominio;

public class Televisao extends Produto{
    public static final double TAXA_POR_CENTO = 0.21;
    public Televisao(String nome, double valor){
        super(nome, valor);
    }

    @Override
    public double calcularTax() {
        System.out.println("Calculando taxa do Televisão");
        return this.valor * TAXA_POR_CENTO;
    }
}
