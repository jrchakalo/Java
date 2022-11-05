import java.util.ArrayList;

public class Team implements ITeam{
    /* 
     *Máximo de ''6'' robôs por vetor.
    */
    
    /*
        * private ArrayList<Integer>starting_team = new ArrayList<>();
        * private ArrayList<Integer>reserve_team = new ArrayList<>();
     */

    //Robot starting_team[];
    //Robot reserve_team[];
    /*
        private ArrayList<Robot>starting_team = new ArrayList<>(6);
        private ArrayList<Robot>reserve_team = new ArrayList<>(6);
    */
    private ArrayList<Robot>starting_team;
    private ArrayList<Robot>reserve_team;

    private int index_Starting = 0;
    private int index_Reserve = 0;

    String name;
    int num_shirt;
    int pos_x;
    int pos_y;

    /*
    public Team(String name, int num_shirt, int pos_x, int pos_y){
        super(name, num_shirt, pos_x, pos_y);
    }
    */

    public Team(){
    }

    @Override
    public void add_robot_starting_Team(Robot new_starting){
        this.starting_team.add(new_starting);
    }

    @Override
    public void add_robot_reserve_Team(Robot new_reserve){
        this.reserve_team.add(new_reserve);
        
    }

    public void replace_robot(Robot replace_to_reserve, Robot replace_to_starting){
        
        for(int i=0; i < starting_team.size(); i++){
            if(starting_team.contains(replace_to_reserve) && reserve_team.contains(replace_to_starting)){
                replace_robot(replace_to_reserve, replace_to_starting);
            }
            else{
                System.out.println("\n\tRobot not found :(\n\n");
            }
        }
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void setName(String name){
        this.name = name;        
    }

    @Override
    public int getNum_shirt() {
        return num_shirt;
    }

    @Override
    public void setNum_shirt(int num_shirt) {
        this.num_shirt = num_shirt;
        
    }

    @Override
    public int getPos_x() {
        return pos_x;
    }

    @Override
    public void setPos_x(int pos_x) {
        this.pos_x = pos_x;
        
    }

    @Override
    public int getPos_y() {
        return pos_y;
    }

    @Override
    public void setPos_y(int pos_y){
        this.pos_y = pos_y;
    }

}
