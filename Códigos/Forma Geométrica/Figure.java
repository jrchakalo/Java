//classe abstrata figura para instanciar recursos comuns entre as classes de figuras.
public abstract class Figure {
    private double l;
    private double h;

    //construtores
    Figure(double l){
        this.l = l;
        this.h = l;
    }

    Figure(double l, double h){
        this.l = l;
        this.h = h;
    }

    //metodos abstratos
    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    //gets
    public double getH() {
        return h;
    }
    public double getL() {
        return l;
    }
}
