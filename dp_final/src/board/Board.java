package board;
import creatures.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * The Board class that creates the board which will hold the creatures and environment
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class Board {
    /**
     * The game board arraylist that hold objects of type Creature
     */
    protected List<Creature> gameBoard = new ArrayList<Creature>();

    /**
     * The Factory to create creatures based on specifications
     */
    CreaturesFactory creaturesFactory = new CreaturesFactory();

    /**
     * Random object to randomize which creature gets produced on the board from the factory
     */
    Random ran = new Random();

    /**
     * The environment arraylist that holds objects of type environment
     */
    protected List<Environment> environmentsBoard=new ArrayList<>();

    /**
     * Instance of builder for the forest environment
     */
    EnvironmentBuilder forestBuilder = new Forest();

    /**
     * Instance of creator to create each individual forests
     */
    EnvironmentCreator forestCreator = new EnvironmentCreator(forestBuilder);

    /**
     * Instance of builder for the cloud environment
     */
    EnvironmentBuilder cloudBuilder = new Clouds();

    /**
     * Instance of creator to create each individual cloud
     */
    EnvironmentCreator cloudsCreator = new EnvironmentCreator(cloudBuilder);

    /**
     * Enumerations for the different types of creatures
     */
    public enum TypeOfCreature {
        GROUND,FLYING;
    }

    /**
     * Enumerations for the different levels of difficulty
     */
    public enum DifficultySetting {
        EASY,MEDIUM,HARD;
    }

    /**
     * Builds the board array based on the specified size
     *
     * @param size specifies how big the board will be, in other words how many rounds the game will last
     * @param difficulty specifies what difficulty to scale the creatures to
     */
    public Board(int size, DifficultySetting difficulty){
        for(int x = 1; x <= size; x++){
            int i = ran.nextInt(2);
            int j=ran.nextInt(2);
            Creature idc=null;
            if(i < 1){
                gameBoard.add(idc=creaturesFactory.makeCreature(TypeOfCreature.GROUND.toString()));
            }
            else if(i == 1){
                gameBoard.add(idc=creaturesFactory.makeCreature(TypeOfCreature.FLYING.toString()));
            }

            if (j<1){
                forestCreator.constructEnvironment();
                Environment forest= forestCreator.getEnvironment();
                environmentsBoard.add(forest);

            }
            else if (j == 1){
                cloudsCreator.constructEnvironment();
                Environment clouds= cloudsCreator.getEnvironment();
                environmentsBoard.add(clouds);

            }

        }
        for (int a=0;a<gameBoard.size();a++){
            if (gameBoard.get(a).getCreatureName().equalsIgnoreCase("Ground Creature") && environmentsBoard.get(a).getEnvironment().equalsIgnoreCase("Forest")){
                gameBoard.get(a).setHitPoints(gameBoard.get(a).getHitPoints()+environmentsBoard.get(a).getBuffValue());
            }
            else if (gameBoard.get(a).getCreatureName().equalsIgnoreCase("Flying Creature")&& environmentsBoard.get(a).getEnvironment().equalsIgnoreCase("Clouds")){
                gameBoard.get(a).setAttackPoints(gameBoard.get(a).getAttackPoints() + environmentsBoard.get(a).getBuffValue());
            }
        }


        if (DifficultySetting.MEDIUM == difficulty){
            for (int k=0;k<gameBoard.size();k++){
                gameBoard.get(k).setAttackPoints(gameBoard.get(k).getAttackPoints()+5);
                gameBoard.get(k).setHealAbility(gameBoard.get(k).getHealAbility()+5);
                gameBoard.get(k).setHitPoints(gameBoard.get(k).getHitPoints()+5);
            }
        }
        else if (DifficultySetting.HARD == difficulty){
            for (int k=0;k<gameBoard.size();k++){
                gameBoard.get(k).setAttackPoints(gameBoard.get(k).getAttackPoints()+10);
                gameBoard.get(k).setHealAbility(gameBoard.get(k).getHealAbility()+10);
                gameBoard.get(k).setHitPoints(gameBoard.get(k).getHitPoints()+10);
            }
        }
    }

    /**
     * Prints the creature along with their current health points and attack points
     */
    public String toString(){
        int i= gameBoard.size();
        for(int x=0;x<i;x++){

            System.out.print(gameBoard.get(x).getCreatureName()+ "\t" + gameBoard.get(x).getHitPoints()+ "\t" + gameBoard.get(x).getAttackPoints());
            System.out.println("\t"+ environmentsBoard.get(x).getEnvironment() + "\t" + environmentsBoard.get(x).getEnvironmentBuff());
            
        }

        return null;
    }
    public int getBoardSize(){
        return gameBoard.size();
    }
    public String getEnvironmentName(int i){
        return environmentsBoard.get(i).getEnvironment();
    }
    public Creature getCreature(int i){
        return gameBoard.get(i);
    }
}