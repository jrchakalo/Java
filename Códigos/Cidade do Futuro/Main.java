public class Main {
    public static void main(String[] args) {
        Robot robot_1 = new Robot();
        Robot robot_2 = new Robot();
        Adult adult = new Adult();
        Child child_1 = new Child();
        Child child_2 = new Child();
        Child child_3 = new Child();
        Child child_4 = new Child();
        Child child_5 = new Child();



        /*
            * Aqui é feita a inicialização dos objetos.
            * 
         */
        child_1.setToy("Boneca");
        child_1.setName("Cecilia");
        child_1.setAdress("Rua Manoel Caneta Azul");
        child_1.setPostal_code(32);

        child_2.setName("Julia");
        child_2.setAdress("Rua Manoel Caneta Azul");
        child_2.setPostal_code(32);

        child_3.setName("Bob");
        child_3.setAdress("Rua Manoel Caneta Azul");
        child_3.setPostal_code(32);

        child_4.setName("Maria");
        child_4.setAdress("Rua Manoel Caneta Azul");
        child_4.setPostal_code(32);

        child_5.setName("Juan");
        child_5.setAdress("Rua Manoel Caneta Azul");
        child_5.setPostal_code(32);





        robot_1.setName("Ronildo o robô");
        robot_1.setAdress("Rua Manoel Caneta Azul");
        robot_1.setPostal_code(32);

        robot_2.setName("Castiel o robô");
        robot_2.setAdress("Rua Julia Brasil");
        robot_2.setPostal_code(1);

        adult.setName("Júnior o careca");
        adult.setAdress("Rua Manoel Caneta Azul");
        adult.setPostal_code(32);
        adult.addKid(child_1);
        adult.addKid(child_2);
        adult.addKid(child_3);
        adult.addKid(child_4);
        /*
            * Testando Limite de filhos.(Funcionando)
         */
        //adult.addKid(child_5);

        /*
            * Cumprimentos entre os objetos.
         */
        robot_1.greet(robot_2);
        adult.greet(robot_1);
        adult.greet(robot_2);
        adult.greet(child_1);
        robot_1.greet(child_1);
        robot_1.greet(adult);

        child_1.greet(robot_1);

        /*
            * Aqui é feita a troca do brinquedo da criança(que já estava setado).
         */
        child_1.setToy("Ball");

        child_1.greet(robot_1);
        

        
    }
}
