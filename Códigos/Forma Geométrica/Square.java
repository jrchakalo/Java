//classe quadrado.
public class Square extends Figure{
    
    //chamada da super classe no construtor.
    Square(double l){
        super(l);
    }

    //implementacao dos calculos de area e periemtro.
    @Override
    public double calculateArea(){
        double area;

        area = this.getH() * this.getL();

        return area;
    }

    @Override
    public double calculatePerimeter(){
        double perimeter;

        perimeter = 4*this.getL();

        return perimeter;
    }
}
