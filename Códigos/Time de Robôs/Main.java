public class Main{

    public static void main(String[] args){

        /*
            *Instanciando o primeiro time e seus jogadores titulares e reservas. 
            * 
         */
        Team team_a = new Team();

        Robot ronaldo_teamA = new Robot("Ronaldo", 10, 2, 2);
        Robot cristiano_teamA = new Robot("Cristiano", 7, 1, 1);
        Robot suarez_teamA = new Robot("Suarez", 32, 3, 3);
        Robot casillas_teamA = new Robot("Casillas", 1, 2,3);
        Robot neymar_teamA = new Robot("Neymar", 12, 1, 3);
        Robot messi_teamA = new Robot("Messi", 8, 3, 1);

        Robot pepe_teamA = new Robot("Pepe", 17, -1, -1);
        Robot marcelo_teamA = new Robot("Marcelo", 22, -1, -1);
        Robot diMaria_teamA = new Robot("Di Maria", 15, -1, -1);
        Robot coutinho_teamA = new Robot("Coutinho", 25, -1, -1);
        Robot kross_teamA = new Robot("Kross", 11, -1, -1);
        Robot danielAlves_teamA = new Robot("Daniel Alves", 9, -1, -1);

        /*
        team_a.add_robot_starting_Team(cristiano_teamA);
        team_a.add_robot_starting_Team(messi_teamA);

        team_a.add_robot_reserve_Team(danielAlves_teamA);
        team_a.add_robot_reserve_Team(pepe_teamA);
        
        */
        
        team_a.replace_robot(messi_teamA, pepe_teamA);

        System.out.println(team_a.toString());

        /*
            *Instanciando o segundo time e seus jogadores titulares e reservas. 
            * 
        */
        Team team_b = new Team();
    }
}
