import java.util.*;

public class Game {
    private String prize;
    private String dud1;
    private String dud2;
    private String [] door = {"Door 1" , "Door 2", "Door 3"};
    
    public Game() {
    }
    public String getPrize(){
        int min = 1;
        int max = 3;
        for(int i = 1; i < 10; i++){
            int index = new Random().nextInt(door.length - min) + min;
            System.out.println("Door "+index +":"+ "prize");
        }
        return prize;
        
    }
}
class Main1{
    public static void main(String [] args){
        Game game = new Game();
        game.getPrize();
    }
}


