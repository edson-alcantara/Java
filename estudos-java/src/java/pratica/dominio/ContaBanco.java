package pratica.dominio;

public class ContaBanco {
    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void estadoAtual(){
        System.out.println("-----------------------");
        System.out.println("Conta: "  + this.getNumConta());
        System.out.println("Tipo: "  + this.getTipo());
        System.out.println("Dono: "  + this.getDono());
        System.out.println("Saldo: "  + this.getSaldo());
        System.out.println("Status: "  + this.isStatus());
    }

    public void abrirConta(String tipo) {
        setTipo(tipo);
        setStatus(true);
        if(tipo == "CC") {
            this.setSaldo(50);
        } else if (tipo == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta() {
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta em  débito");
        }else {
            setStatus(false);
            System.out.println("Conta Fechada com sucesso!");
        }
    }

    public void depositar(double valor){
        if(status == true){
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso!");
        }else{
            System.out.println("Impossível depositar");
        }
    }

    public void sacar(double valor){
        if(status == true){
            if(getSaldo() >= valor){
                setSaldo(getSaldo() - valor);
                System.out.println("Saque realizado com sucesso!");
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossível sacar");
        }
    }
    public void pagarMensal(){
        double v = 0;
        if(this.tipo == "CC") {
            v = 12;
        }else if(this.tipo == "CP") {
            v = 20;
        }
        if(status == true){
            if(this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossível pagar");
        }
    }


}
