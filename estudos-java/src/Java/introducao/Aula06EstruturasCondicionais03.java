package Java.introducao;

public class Aula06EstruturasCondicionais03 {
    public static void main(String[] args){
        double salario = 6000;
        String mensagemDoar = "Eu vou doar R$500 para os desabrigados!";
        String mensagemNaoDoar = "Não tenho condições para doar!";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

    }
}
