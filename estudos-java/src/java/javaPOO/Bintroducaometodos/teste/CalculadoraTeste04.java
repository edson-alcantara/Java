package estudos.javaPOO.Bintroducaometodos.teste;

import estudos.javaPOO.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 15;
        int num2 = 20;
        calculadora.alterarnum(num1, num2);
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
