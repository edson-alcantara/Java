package introducao;
/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>
*/

public class Aula02TiposPrimitivosExercicio {
    public static void main(String[] args){
        String nome = "Edson";
        var endereco = "Janga";
        float salario = 2500;
        String dataRecebimento = "03/08/2026";

        System.out.println("Eu "+nome+ ", morando no endereço " +endereco+
                ", confirmo que recebi o salário de " +salario+ ", na data " +dataRecebimento);
    }
}
