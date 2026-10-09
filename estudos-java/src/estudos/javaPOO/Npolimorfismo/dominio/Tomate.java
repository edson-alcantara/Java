package estudos.javaPOO.Npolimorfismo.dominio;

public class Tomate  extends Produto{
    public static final double TAXA_POR_CENTO = 0.06;
    private String dataValidade;
    public Tomate(String nome, double valor){
        super(nome, valor);
    }

    @Override
    public double calcularTax(){
        System.out.println("Calculando taxa do tomatte");
        return this.valor * TAXA_POR_CENTO;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }
}
