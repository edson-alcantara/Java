package pratica.teste;

import pratica.dominio.Bolsista;

public class CanetaTeste {
    public static void main(String[] args){
        Bolsista.Caneta c1 = new Bolsista.Caneta();
        c1.modelo = "Bic";
        c1.cor = "azul";
        c1.setPonta(0.5);
        c1.tampada = false;

        c1.status();
        c1.rabiscar();
        c1.tampar();
        System.out.println("-------------------");
        c1.status();
        System.out.println("--------------");
        System.out.printf("Ponta: " + c1.getPonta());
    }
}
