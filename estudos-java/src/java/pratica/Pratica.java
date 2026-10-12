package pratica;

import java.util.Scanner;

public class Pratica {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota1 do aluno: ");
        float nota1 = teclado.nextFloat();
        System.out.print("Digite a nota2 do aluno: ");
        float nota2 = teclado.nextFloat();
        System.out.print("Digite a nota3 do aluno: ");
        float nota3 = teclado.nextFloat();
        float media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("A nota de %s é %.1f%n", nome, media);

        if(media >= 6){
            System.out.println("Aprovado");
        } else if (media == 5) {
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
    }
}
