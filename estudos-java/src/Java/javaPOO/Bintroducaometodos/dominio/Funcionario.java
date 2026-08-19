package Java.javaPOO.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println(nome);
        System.out.println(this.idade);
        if(salarios != null) {
            for (double salario : salarios) {
                System.out.println(salario + " ");
            }
        }
    }
    public void mediaSalarial(){
        if(salarios == null) {
            return;
        }
        double media = 0;
        for(double salario: salarios){
            media += salario;
        }
        media = media/salarios.length;
        System.out.println("Média Salarial " + media);
    }
}
