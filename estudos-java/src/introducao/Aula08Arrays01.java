package introducao;

public class Aula08Arrays01 {
    public static void main(String[] args){
        int[] idades = new int[4];
        idades[0] = 10;
        idades[1] = 21;
        idades[2] = 32;
        idades[3] = 43;

        for(int i = 0; i < idades.length; i++){
            System.out.println(idades[i]);
        }
    }
}