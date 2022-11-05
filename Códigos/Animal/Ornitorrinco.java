public class Ornitorrinco implements Animal{
    private double peso;

    Ornitorrinco (double p){
        peso = p;
    }
    public double peso(){
        return peso;
    }
    public void nasca(){
        System.out.println("Um lindo ornitorrinco nasceu de um ovo!");
    }
    public void passeie(){
        System.out.println("O ornitorrico nada na agua e anda na terra!");
    }
    public void durma(){
        System.out.println("O ornitorrinco se esconde em tuneis pra dormir!");
    }
}

