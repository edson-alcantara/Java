package pratica.dominio;

public class Caneta {
    public String modelo;
    public String cor;
    public Double ponta;
    public int carga;
    public boolean tampada;

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
