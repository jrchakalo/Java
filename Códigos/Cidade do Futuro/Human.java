import java.util.ArrayList;

public class Human extends Citizen implements IHuman{
    
    private ArrayList<String>friends = new ArrayList<>();

    Citizen data;

    public Human(){
        super();
    }

    public Human(String name, String adress, int postal_code){
        super(name, adress, postal_code);
    }

    @Override
    public String toString() {
        return "Citizen \n\nName: " + super.toString();
    }

    @Override
    public void greet(Citizen greetCitizen){
        System.out.println("Olá " + greetCitizen.getName() + "!");
        this.friends.add(greetCitizen.getName());
    }

}
