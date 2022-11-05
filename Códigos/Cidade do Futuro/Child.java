public class Child extends Citizen implements IHuman, IChild{

    String toy;
    Citizen data;

    public Child(){

    }

    public Child(String name, String adress, int postal_code){
        super(name, adress, postal_code);
    }

    @Override
    public void greet(Citizen greetCitizen) {
        System.out.println("\nCriança:\nQuer brincar com meu " + this.toy + "?\n");
        
    }

    @Override
    public String getToy() {
        return toy;
    }

    @Override
    public void setToy(String toy) {
        this.toy = toy;
    }

    @Override
    public String toString() {
        return "Citizen \n\nName: " + super.toString();
    }
}
