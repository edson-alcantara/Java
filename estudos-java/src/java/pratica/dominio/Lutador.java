package pratica.dominio;

public class Lutador implements Luta {
    private String nome;
    private String nacionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias, derrotas, empates;

    public Lutador(String nome, String nacionalidade, int idade,  double altura, double peso,
                   int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade(){
        return this.nacionalidade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setPeso(double peso){
        this.peso = peso;
        setCategoria();
    }

    public double getPeso(){
        return this.peso;
    }

    private void setCategoria(){
        if(this.peso <= 52.2){
            this.categoria = "Inválido";
        }else if(this.peso <= 70){
            this.categoria = "Leve";
        }else if(this.peso <= 85){
            this.categoria = "Médio";
        }else if(this.peso <= 120){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public String getCategoria(){
        return this.categoria;
    }

    public void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    public int getVitorias(){
        return this.vitorias;
    }

    public void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    public int getDerrotas(){
        return this.derrotas;
    }

    public void setEmpates(int empates){
        this.empates = empates;
    }

    public int getEmpates(){
        return this.empates;
    }

    @Override
    public void apresentar() {
        System.out.println("-----------------------------------");
        System.out.println("CHEGOU A HORA DO COMBATE! Apresentamos o lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Com: " + this.getIdade() + " anos e " + this.getAltura() + " M");
        System.out.println("Pesando: " + this.getPeso());
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórais");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
        System.out.println("----------------------------------");
    }

    @Override
    public void status() {
        System.out.println("Nome: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Vitórias: " + getVitorias());
        System.out.println("Derrotas: " + getDerrotas());
        System.out.println("Empates: " + getEmpates());
    }

    @Override
    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }
}
