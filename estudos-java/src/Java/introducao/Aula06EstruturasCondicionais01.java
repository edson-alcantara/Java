package Java.introducao;

public class Aula06EstruturasCondicionais01 {
    public static void main(String[] args){
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;
        if(isAutorizadoComprarBebida){
            System.out.println("Autorizado comprar bebida alcólica!");
        }else{
            System.out.println("Não está autorizado comprar bebida alcólica!");
        }
    }
}
