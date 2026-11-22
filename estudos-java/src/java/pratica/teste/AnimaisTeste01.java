package pratica.teste;

import pratica.Animais.*;

public class AnimaisTeste01 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Aves av = new Aves();
        Canguro c = new Canguro();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga tar = new Tartaruga();
        GoldenFish gf = new GoldenFish();
        Arara a = new Arara();

        c.locomover();
        ca.locomover();
        tar.locomover();
    }
}
