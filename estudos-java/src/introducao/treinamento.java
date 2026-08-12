package introducao;

public class treinamento {
    public static void main(String[] args){
        int contador = 0;
        int soma = 0;
        double media = 0;
        for(int i = 2; i <= 100; i++){
            boolean primo = true;
            for(int b = 2; b < i; b++){
                if(i % b == 0){
                    primo = false;
                    break;
                }
            }
        if(primo){
            contador++;
            soma += i;
        }
        }
        media = (double) soma / contador;
        System.out.println("Quantidades de números primos: " + contador);
        System.out.println("Soma dos números primos: " + soma);
        System.out.println("Média dos números primos: " + media);
    }
}
