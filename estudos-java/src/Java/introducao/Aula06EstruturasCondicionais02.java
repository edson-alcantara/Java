package Java.introducao;

public class Aula06EstruturasCondicionais02 {
    public static void main(String[] args){
        // idade < 15 categoria infatil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 20;
        String categoria;
        if(idade < 15){
            categoria = "Categoria Infatil!";
        }else if(idade > 15 && idade < 18){
            categoria = "Categoria Juvenil!";
        }else{
            categoria = "Categoria Adulto!";
        }
        System.out.println(categoria);
    }
}
