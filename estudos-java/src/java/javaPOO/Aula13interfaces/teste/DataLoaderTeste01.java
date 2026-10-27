package javaPOO.Aula13interfaces.teste;

import javaPOO.Aula13interfaces.dominio.DataBaseLoader;
import javaPOO.Aula13interfaces.dominio.DataLoader;
import javaPOO.Aula13interfaces.dominio.FileLoader;

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
