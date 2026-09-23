package Java.javaPOO.Hheranca.dominio;

public class Funcionario extends Pessoa {
    private double salario;

    static{
        System.out.println("Dentro do bloco estático funcionario");
    }
    {
        System.out.println("Bloco de inicialização de funcionario1");
    }

    {
        System.out.println("Bloco de inicialização de funcionario2");
    }

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void imprime(){
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }

    public void relatorioPagamento(){
        System.out.println("Eu " + this.nome + " recebi o salário " + this.salario);
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}
