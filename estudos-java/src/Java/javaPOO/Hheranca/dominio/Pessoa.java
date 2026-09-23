package Java.javaPOO.Hheranca.dominio;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    static{
        System.out.println("Dentro do bloco estático Pessoa");
    }
    {
        System.out.println("Bloco de inicialização de pessoa1");
    }

    {
        System.out.println("Bloco de inicialização de pessoa2");
    }

    public Pessoa(String nome){
        System.out.println("Dentro do construtor Pessoa");
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }

    public void imprime(){
        System.out.println("Nome do Pessoa: " + this.nome);
        System.out.println("CPF do Pessoa: " + this.cpf);
        System.out.println("Endereco do Pessoa: " + this.endereco.getRua() + "\nCep: " + this.endereco.getCep());
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
}
