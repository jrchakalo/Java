public interface ICitizen {
    String getName();
    void setName(String name);

    String getAdress();
    void setAdress(String adress);

    int getPostal_code();
    void setPostal_code(int postal_code);

    void greet(Citizen greetCitizen);
}
