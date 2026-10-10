package java.javaPOO.Minterfaces.teste;


import java.javaPOO.Minterfaces.dominio.DataBaseLoader;
import java.javaPOO.Minterfaces.dominio.DataLoader;
import java.javaPOO.Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DataBaseLoader dataBaseLoader = new DataBaseLoader();
        FileLoader fileLoader = new FileLoader();
        dataBaseLoader.laod();
        fileLoader.laod();

        dataBaseLoader.remove();
        fileLoader.remove();

        dataBaseLoader.checkPermission();
        fileLoader.checkPermission();

        DataLoader.retrieveMaxDataSize();
        DataBaseLoader.retrieveMaxDataSize();

    }
}
