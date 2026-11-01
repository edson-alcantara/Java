package pratica.dominio;

public class ContaBanco {
    private int numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(double saldo, boolean status) {
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

    public void abrirConta(String tipo, String dono, double saldo, boolean status) {
        if (status == true) {
            System.out.printf("Conta aberta com sucesso!\n");
        }
    }

    public void fecharConta() {
        if (status == true) {
            System.out.printf("Conta Fechada com sucesso!\n");
        }
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void sacar(double valor){
        this.saldo -= valor;
    }


}
