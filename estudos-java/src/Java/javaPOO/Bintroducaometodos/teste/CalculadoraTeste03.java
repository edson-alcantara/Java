package Java.javaPOO.Bintroducaometodos.teste;

import Java.javaPOO.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double  result = calculadora.divisao(4, 2);
        System.out.println(result);
        System.out.println(calculadora.divisao2(4, 0));
        System.out.println("-------------------");
        calculadora.divisao3(20, 2);
    }
}
