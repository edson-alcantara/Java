package javaPOO.Aula02introducaometodos.teste;

import javaPOO.Aula02introducaometodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Somando...");
        calculadora.somar();
        System.out.println("Subtraindo...");
        calculadora.subtrair();

    }
}
