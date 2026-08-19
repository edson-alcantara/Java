package Java.javaPOO.Aintroducaoclasses.teste;

import Java.javaPOO.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args){
        Estudante estudante = new Estudante();
        estudante.nome = "Edson";
        estudante.idade = 33;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
