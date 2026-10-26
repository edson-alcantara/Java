package introducao;

public class Aula07EstruturasDeRepeticao04 {
    public static void main(String[] args){
        //Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição valorParcela >= 1000
        double carro = 40000;
        double valorParcela = 2000;
        for (int parcelas = 1; parcelas <= carro/valorParcela; parcelas++){
            if(valorParcela < 1000){
                break;
            }
            System.out.println(parcelas +"x de R$ "+ (carro/parcelas));
        }

    }
}
