package Java.javaPOO.Minterfaces.teste;


import Java.javaPOO.Minterfaces.dominio.DataBaseLoader;
import Java.javaPOO.Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.laod();
        fileLoader.laod();
    }
}
