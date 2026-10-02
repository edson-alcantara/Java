package Java.javaPOO.Minterfaces.dominio;

public class FileLoader implements DataLoader {
    @Override
    public void laod() {
        System.out.println("Carregando dados de um arquivo.");
    }
}
