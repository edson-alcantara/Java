package pratica.teste;

import pratica.Animais.Cachorro;
import pratica.Animais.Lobo;
import pratica.Animais.Mamifero;

public class AnimaisTeste02 {
    public static void main(String[] args){
       Mamifero m = new Mamifero();
       Cachorro c = new Cachorro();
       Lobo l = new Lobo();

       m.emitirSom();
       c.emitirSom();
       l.emitirSom();
       c.reagir(true);
       c.reagir("Toma comida");
       c.reagir(18, 45);
       c.reagir(2, 10.5);
    }
}
