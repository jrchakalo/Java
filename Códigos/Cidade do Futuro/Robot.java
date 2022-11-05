public class Robot extends Citizen{

    Citizen data;


    public Robot(){

    }

    public Robot(String name, String adress, int postal_code){
        super(name, adress, postal_code);
    }

    @Override
    public void greet(Citizen greetCitizen) {
        if(greetCitizen.getPostal_code() == this.getPostal_code()){
            System.out.println("\nRobô:\nOlá vizinho " +  greetCitizen.getName() +  "!\n");
        }
    }
    
}
