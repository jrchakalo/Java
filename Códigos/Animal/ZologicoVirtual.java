public class ZologicoVirtual {
    static public void cicloDeVida(Animal animal){
        animal.nasca();
        if(animal instanceof Zebra){
            ((Zebra) animal).contaListras();
        }
        animal.passeie();
        animal.durma();
    }

    static public void fazFunc(){
        Animal z1 = new Zebra(102, 107);
        Animal z2 = new Zebra(98, 123);
        Animal m1 = new Morcego();
        Animal o1 = new Ornitorrinco(32);


        cicloDeVida(z1);
        cicloDeVida(z2);
        cicloDeVida(m1);
        cicloDeVida(o1);
    }
}

