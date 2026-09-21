package Java.javaPOO.Hheranca.dominio;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

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
