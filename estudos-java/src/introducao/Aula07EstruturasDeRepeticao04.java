package introducao;

public class Aula07EstruturasDeRepeticao04 {
    public static void main(String[] args){
        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição valorParcela >= 1000
        int carro = 40000;
        int valorParcela = 1000;
        int parcela = valorParcela / carro;
        for (int parcela = 0; parcela < carro; parcela++){
            System.out.println(parcela);
        }
    }
}
