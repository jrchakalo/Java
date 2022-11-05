//classe triangulo.
public class Triangle extends Figure{
    
    //chamada da superclasse no construtor
    Triangle(double l, double h){
        super(l, h);
    }

    //implementacao dos calculos.
    @Override
    public double calculateArea(){
        double area;

        area = (this.getL()*this.getH())/2;

        return area;
    }

    @Override
    public double calculatePerimeter(){
        double perimeter;

        //supondo um triangulo equilatero
        perimeter = 3*this.getL();

        return perimeter;
    }
}
