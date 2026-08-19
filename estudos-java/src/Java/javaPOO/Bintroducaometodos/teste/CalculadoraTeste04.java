package Java.javaPOO.Bintroducaometodos.teste;

import Java.javaPOO.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 10;
        int num2 = 20;
        calculadora.alterarnum(num1, num2);
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }
}
