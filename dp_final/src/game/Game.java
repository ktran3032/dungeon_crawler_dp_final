package game;
import board.*;
import player.*;
import creatures.*;
import settings.*;

import java.util.Scanner;

public class Game {
    /**
     * The name of the player that they themselves enter
     */
    private String pName;

    /**
     * The choice the player makes in the menu
     */
    private int pChoice;

    /**
     * The difficulty that the player chooses
     */
    private int pDifficulty;

    /**
     * Instance of the board
     */
    private Board gameBoard;

    /**
     * The player's creature that is created after they choose the specifications
     */
    private PlayerCreature player1=null;

    /**
     * The enemy creature that is on the current tile of the board
     */
    private Creature enemy=null;


    /**
     * The Method that runs the entire game
     */
    public Game(){
        Scanner scan =new Scanner(System.in);
        DifficultyStateContext difficulty=new DifficultyStateContext();


        System.out.print("Welcome to the game!\nPlease enter your name: ");
        pName=scan.nextLine();
        System.out.println("Welcome "+pName+"!\n");
        System.out.println("Choose type of creature you would like to be!");
        System.out.println("1:Ground Creature");
        System.out.println("2:Flying Creature\n");
        pChoice=scan.nextInt();

        while (pChoice!=1 & pChoice!=2){
            System.out.println("Invalid input, please enter the correct input.");
            pChoice=scan.nextInt();
        }
        if (pChoice==1){
            player1=new PlayerCreature(pName,"g");
            System.out.println("You are a ground creature!\n");
        }else if(pChoice==2) {
            player1 = new PlayerCreature(pName, "f");
            System.out.println("You are a flying creature!\n");
        }


        System.out.println("Choose your difficulty setting!");
        System.out.println("1:Easy");
        System.out.println("2:Medium");
        System.out.println("3:Hard\n");
        pDifficulty=scan.nextInt();

        while (pDifficulty!=1 & pDifficulty!=2 & pDifficulty!=3){
            System.out.println("Invalid input, please enter the correct input.");
            pDifficulty=scan.nextInt();
        }
        if (pDifficulty==1){
            System.out.println("You have chosen "+ difficulty.alert()+" difficulty.\n");
        }else if(pDifficulty==2) {
            difficulty.setDifficulty(new MediumDifficulty());
            System.out.println("You have chosen "+ difficulty.alert()+" difficulty.\n");
        }else if (pDifficulty==3){
            difficulty.setDifficulty(new HardDifficulty());
            System.out.println("You have chosen "+ difficulty.alert()+" difficulty.\n");
        }

        gameBoard=new Board(5, Board.DifficultySetting.valueOf(difficulty.alert()));

        for (int i=0;i<gameBoard.getBoardSize();i++){
            player1.setHitPoints(player1.getOriginalHP());
            enemy=gameBoard.getCreature(i);
            enemy.setHitPoints(enemy.getHitPoints()+(2*i));
            enemy.setAttackPoints(enemy.getAttackPoints()+(2*i));
            enemy.setHealAbility(enemy.getHealAbility()+(2*i));

            System.out.println("Get ready for Battle!\n");
            System.out.println("Stage: " +(i+1));
            System.out.println("The " +gameBoard.getEnvironmentName(i)+" Stage!");
            System.out.println(player1.getPName()+ " VS " + enemy.getCreatureName());
            System.out.println("You go first!");
            System.out.println();

            Battle b=new Battle();
            b.setPlayerCreature(player1);
            b.setEnemyCreature(enemy);
            b.initialCreatureHealth(enemy.getHitPoints());

            do {System.out.println("Player HP: "+player1.getHitPoints()+"\tEnemy HP: "+enemy.getHitPoints());
                System.out.println("---------------------------------------------------------------------------------");
                b.battle();
                System.out.println("---------------------------------------------------------------------------------");
                }while (player1.getHitPoints() > 0 && enemy.getHitPoints() > 0);

            if (player1.getHitPoints()<=0){
                System.out.println(player1.getPName()+" Died!");
                if (difficulty.alert().equalsIgnoreCase("Hard")){
                    difficulty.setDifficulty(new MediumDifficulty());
                    System.out.println("Difficulty has been lowered, good luck next battle!");
                    System.out.println("Difficulty is now "+ difficulty.alert());
                }else if (difficulty.alert().equalsIgnoreCase("Medium")) {
                    System.out.println("Difficulty has been lowered, good luck next battle!");
                    difficulty.setDifficulty(new EasyDifficulty());
                    System.out.println("Difficulty is now " + difficulty.alert());
                }else if (difficulty.alert().equalsIgnoreCase("Easy")){
                    System.out.println("Difficulty cant go any lower! Sorry!");
                    System.out.println("Game Over");
                    System.exit(1);
                }
            }


            player1.hpEvolved(player1);
            System.out.println("---------------------------------------------------------------------------------\n\n\n");

        }
        System.out.println("****** You won the game! ******");

    }


}
