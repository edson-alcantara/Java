package introducao;

public class Aula03Operadores {
    public static void main(String[] args){
        int num1 = 10;
        int num2 = 20;
        double resultado = num1 / (double) num2;
        System.out.println(resultado);

        // %
        int resto = 10 % 2;
        System.out.println(resto);

        // < >, <= >=, == !=
        boolean isDezMaiorQuevinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("Dez é maior que vinte? "+isDezMaiorQuevinte);
        System.out.println("Dez é menor que vinte? "+isDezMenorQueVinte);
        System.out.println("Dez é igual  vinte? "+isDezIgualVinte);
        System.out.println("Dez é diferente de vinte? "+isDezDiferenteVinte);
    }
}
