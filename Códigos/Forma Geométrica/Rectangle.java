//classe retangulo.
public class Rectangle extends Figure{

    //chamada da superclasse no construtor
    Rectangle(double l, double h){
        super(l, h);
    }

    //implementacao dos calculos.
    @Override
    public double calculateArea(){
        double area;

        area = this.getH() * this.getL();

        return area;
    }

    @Override
    public double calculatePerimeter(){
        double perimeter;

        perimeter = 2*(this.getH()+this.getL());

        return perimeter;
    }
}
