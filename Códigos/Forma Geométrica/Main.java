//main
public class Main {
    public static void main (String args[]){
        //instacia das figuras geometricas.
        Figure t = new Triangle(4, 6);
        Figure r = new Rectangle(9, 6);
        Figure q = new Square(12);

        //output dos testes.
        System.out.println("A area do quadrado de lado " + q.getL() + " eh: " + q.calculateArea());
        System.out.println("O perimetro desse quadrado eh: " + q.calculatePerimeter());
        System.out.println("A area do retangulo de base " + r.getL() + " e altura " + r.getH() + " eh: " + r.calculateArea());
        System.out.println("O perimetro desse retangulo eh: " + r.calculatePerimeter());
        System.out.println("A area do triangulo de base " + t.getL() + " e altura " + t.getH() + " eh: " + t.calculateArea());
        System.out.println("O perimetro desse triangulo eh: " + t.calculatePerimeter());
    }
}
