package introducao;

public class Aula04peradoresLogicos {
    public static void main(String[] args){
        // && (AND), || (OR), !
        int idade = 33;
        float salario = 5500F;
        boolean isDentroDaLei = idade > 30 && salario >= 4612;

        System.out.println("Está dentro da lei? "+isDentroDaLei);

        double valorTotalContaCorrente = 200;
        double valorTotalContapoupanca = 10000;
        float valorPS5 = 5000F;
        boolean isPS5Compravel = valorTotalContaCorrente > valorPS5 || valorTotalContapoupanca > valorPS5;

        System.out.println("Dá para comprar o PS5? " +isPS5Compravel);
    }
}
