package Java.javaPOO.Bintroducaometodos.dominio;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    public void imprime(){
        System.out.println("-----------------");
        System.out.println(nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
