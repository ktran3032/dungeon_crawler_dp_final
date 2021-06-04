package game;

import creatures.Creature;
import player.*;
import gameAI.*;
import java.util.Random;
import java.util.Scanner;

public class Battle {
    /**
     * The player's choice of which course of action to take
     */
    private int choice;

    /**
     * The player creature itself
     */
    private PlayerCreature newP=null;

    /**
     * The current creature the player is fighting
     */
    private Creature newC=null;

    /**
     * The initial health of the current creature
     */
    private int creatureHealth;

    /**
     * The power ups the player may choose
     */
    Powers powers = new Powers();

    /**
     * The AI of the flying creature
     */
    FlyingAI flyingAI=new FlyingAI();

    /**
     * The AI of the ground creature
     */
    GroundAI groundAI = new GroundAI();

    /**
     * Gets the creatures unaltered health
     *
     * @param health the initial health of the current creature
     */
    public void initialCreatureHealth(int health){
        creatureHealth=health;
    }

    /**
     * Loads the player side of the stage
     *
     * @param pc The player creature
     */
    public void setPlayerCreature(PlayerCreature pc){
        newP=pc;
    }

    /**
     * Loads the creature side of the stage
     *
     * @param ec The enemy creature
     */
    public void setEnemyCreature(Creature ec){
        newC=ec;
    }

    /**
     * The battle sequence for the entire game
     */
    public void battle(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose your option.");
        System.out.println("1: Attack");
        System.out.println("2: Heal");
        System.out.println("3: Power Up");
        System.out.println("4: Do Nothing");
        System.out.println();
        choice=scan.nextInt();
        while (choice!=1 & choice !=2 & choice !=3 & choice !=4){
            System.out.println("You can't do that! Try another input.");
            scan.nextInt();
        }
        if (choice==1){
            int i;
            System.out.println("Choose your attack style.");
            System.out.println("1: Normal Attack");
            System.out.println("2: Power Attack");
            System.out.println("3: Heal Attack");
            System.out.println();
            i=scan.nextInt();
            while (choice!=1 & choice !=2 & choice !=3){
                System.out.println("You can't do that! Try another input.");
                scan.nextInt();
            }
            if (i==1){
                StrategyContext sc=new StrategyContext(new NormalAttack());
                sc.executeStrategy(newP,newC);
            }else if (i==2){
                StrategyContext sc=new StrategyContext(new PowerAttack());
                sc.executeStrategy(newP,newC);
            }else if (i==3){
                StrategyContext sc=new StrategyContext(new HealAttack());
                sc.executeStrategy(newP,newC);
            }
        }else if (choice==2){
            System.out.println("you chose to heal!");
            newP.setHitPoints(newP.getHitPoints()+newP.getHealAbility());
            System.out.println("You have "+ newP.getHitPoints()+ " health.\n");
        }else if (choice==3){
            System.out.println("You chose to power up");
            int j;
            System.out.println("Choose your power up.");
            System.out.println("1: Attack power up");
            System.out.println("2: Heal ability power up");

            j = scan.nextInt();
            while (j != 1 & j != 2) {
                System.out.println("You can't do that! Try another input.");
                scan.nextInt();
            }
            if (j == 1) {
                powers.setAttackPowerUp(newP);
            } else if (j == 2) {
                powers.setHealAbilityPowerUp(newP);
            }
        }else if (choice==4){
            System.out.println("you chose to do nothing!");
        }
        Random random= new Random();
        int x= random.nextInt(100);
        if (newC.getHitPoints()>0){
            if (newC.getCreatureName().equalsIgnoreCase("Flying Creature")){
                if (x<=5){
                    flyingAI.doNothing();
                }else if (newC.getHitPoints()>=(creatureHealth/2)){
                    flyingAI.attack(newC,newP);
                }else if (newC.getHitPoints()<creatureHealth/2){
                    flyingAI.heal(newC);
                }
            }else if (newC.getCreatureName().equalsIgnoreCase("Ground Creature")){
                if (x<=5){
                    groundAI.doNothing();
                }else if (newC.getHitPoints()>=(creatureHealth/2)){
                    groundAI.attack(newC,newP);
                }else if (newC.getHitPoints()<creatureHealth/2){
                    groundAI.heal(newC);
                }
            }
        }else {System.out.println("You have slain the creature!");}

    }
}
