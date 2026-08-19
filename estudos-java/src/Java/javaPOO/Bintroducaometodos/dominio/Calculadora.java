package Java.javaPOO.Bintroducaometodos.dominio;

public class Calculadora {
    public void somar(){
        System.out.println(10 + 10);
    }
    public void subtrair(){
        System.out.println(20 - 10);
    }
    public void multiplicacao(int num1, int num2){
        System.out.println(num1 * num2);
    }
    public double divisao(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public double divisao2(double num1, double num2){
        if(num2 != 0){
            return num1/num2;
        }
        System.out.println("Não existe divisão por zero!");
        return 0;
    }

    public void divisao3(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero!");
            return;
        }
        System.out.println(num1/num2);
    }

    public void alterarnum(int num1, int num2){
        num1 = 99;
        num2 = 34;
        System.out.println("Dentro do alterarnum!");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
