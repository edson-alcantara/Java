package Java.javaPOO.Aintroducaoclasses.teste;

import Java.javaPOO.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.marca = "Volkswagen";
        carro.modelo = "Gol";
        carro.ano = 2018;

        carro2.marca = "Volkswagen";
        carro2.modelo = "Fusca";
        carro2.ano = 1975;

        System.out.println("Marca: " + carro.marca + " " + "Modelo: " + carro.modelo + " " + "Ano: " + carro.ano);
        System.out.println("Marca: " + carro2.marca + " " + "Modelo: " + carro2.modelo + " " + "Ano: " + carro2.ano);
    }
}
