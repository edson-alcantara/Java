package pratica.dominio;

public class Bolsista extends Aluno{
    private double bolsa;

    public void setBolsa(double bolsa){
        this.bolsa = bolsa;
    }

    public double getBolsa(){
        return this.bolsa;
    }

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.nome + ".");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.nome + " é bolsista! Pagamento facilitado.");
    }

    public static class Caneta {
        public String modelo;
        public String cor;
        private Double ponta;
        public int carga;
        public boolean tampada;



        public Double getPonta() {
            return this.ponta;
        }

        public void setPonta(Double ponta) {
            this.ponta = ponta;
        }

        public void status(){
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Cor: " + this.cor);
            System.out.printf("Ponta: %.2f\n", this.ponta);
            System.out.println("Tampada: " + this.tampada);
        }

        public void rabiscar(){
            if(this.tampada == true){
                System.out.println("Caneta Tampada");
            }else{
                System.out.println("Pode rabiscar");
            }
        }

        public void tampar(){
            this.tampada = true;
        }

        public void destampar(){
            this.tampada = false;
        }
    }
}
