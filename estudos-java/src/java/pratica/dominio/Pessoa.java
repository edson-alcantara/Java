package pratica.dominio;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;

    public Pessoa() {
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void fazerAniversario(){
        this.idade++;
    }

    @Override
    public String toString() {
        return "Dados{" +
                "Nome= '" + nome + '\'' +
                ", Idade= " + idade +
                ", Sexo= '" + sexo + '\'' +
                '}';
    }
}
