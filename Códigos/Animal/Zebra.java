public class Zebra implements Animal{
    private double peso;
    private int listras;

    Zebra(double peso, int listras){
        this.peso = peso;
        this.listras = listras;
    }

    public void nasca(){
        System.out.println("Nasceu uma linda zebrinha!");
    }
    public void passeie(){
        System.out.println("A zebrinha trota para la e para ca!");
    }
    public void durma(){
        System.out.println("A zebrinha dorme nos campos!");
    }
    public double peso(){
        return peso;
    }
    public void contaListras(){
        System.out.println("Essa zebrinha tem " + listras + " listras no corpo!");
    }
}
