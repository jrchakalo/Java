public abstract class Citizen implements ICitizen{
    private String name;
    private String adress;
    private int postal_code;

    public Citizen(){

    }

    public Citizen(String name, String adress, int postal_code){
        this.name = name;
        this.adress = adress;
        this.postal_code = postal_code;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAdress() {
        return adress;
    }

    @Override
    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public int getPostal_code() {
        return postal_code;
    }

    @Override
    public void setPostal_code(int postal_code) {
        this.postal_code = postal_code;
    }

    @Override
    public String toString() {
      return "\nNome: " + name + "\nEndereco: " + adress + "\nCEP: " + postal_code;
    }
}
