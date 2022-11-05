public class Robot implements IRobot{
    
    /*Considerando robôs reservas(fora de campo), temos:
        Localização default(-1, -1);
        num_camisa default (-1).
    */
    private String name;
    private int num_shirt;
    int pos_x;
    private int pos_y;

    public Robot(String name, int num_shirt, int pos_x, int pos_y){

        this.name = name;
        this.num_shirt = num_shirt;
        this.pos_x = pos_x;
        this.pos_y = pos_y;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNum_shirt() {
        return num_shirt;
    }

    @Override
    public int getPos_x() {
        return pos_x;
    }

    @Override
    public int getPos_y() {
        return pos_y;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setNum_shirt(int num_shirt) {
        this.num_shirt = num_shirt;
    }

    @Override
    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
    }

    @Override
    public void setPos_y(int pos_y) {
        this.pos_y = pos_y;
    }

    @Override
    public String toString() {
        return "\nName: " + name + "\nNum_shirt: " + num_shirt + "\nPos_x: " + pos_x + "\t\tPos_y" + pos_y;
      }
}
