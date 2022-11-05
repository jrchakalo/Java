import java.util.ArrayList;

public class Adult extends Citizen implements IHuman, IAdult{
    
    String profession;

    private ArrayList<String>children = new ArrayList<>();
    private ArrayList<String>friends = new ArrayList<>();

    public Adult(){

    }
    public Adult(String name, String adress, int postal_code){
        super(name, adress, postal_code);
    }


    @Override
    public void greet(Citizen greetCitizen){
        System.out.println("\nAdulto:\nOlá " + greetCitizen.getName() + "!\n");
        System.out.println("Meu(s) " + children + "filho(s/as).");
        this.friends.add(getName());
    }
    @Override
    public void addKid(Child child){
        if(children.size() >= 4){
            this.children.add(child.getName());
        }
        else{
            System.out.println("Limite de filhos atingidos!");
        }
    }

    @Override
    public String toString() {
        return "Citizen \n\nName: " + super.toString();
    }
    @Override
    public String getProfession() {
        return profession;
    }
    @Override
    public void setProfession(String profession) {
        this.profession = profession;
    }
}
