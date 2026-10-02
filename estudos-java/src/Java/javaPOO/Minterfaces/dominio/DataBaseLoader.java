package Java.javaPOO.Minterfaces.dominio;

public class DataBaseLoader implements DataLoader {
    @Override
    public void laod() {
        System.out.println("Carregando dados do banco de dados.");
    }
}
