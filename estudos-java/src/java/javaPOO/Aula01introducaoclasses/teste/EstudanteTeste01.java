package javaPOO.Aula01introducaoclasses.teste;

import javaPOO.Aula01introducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args){
        Estudante estudante = new Estudante();
        estudante.nome = "Pedro";
        estudante.idade = 33;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
