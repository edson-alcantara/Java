package Java.javaPOO.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprimir() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
