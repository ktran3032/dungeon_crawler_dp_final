package player;

/**
 * The player creature
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class PlayerCreature implements Player{
    /**
     * String variable that holds the player's name
     */
    private String playerName;

    /**
     * Int variable that holds the health value of the player
     */
    private int playerHP;

    /**
     * Int variable that holds the amount of damage the player can deal
     */
    private int playerAttackPoints;
    /**
     * Int variable that holds the amount the damage player can heal
     */
    private int playerHealAbility;

    /**
     * Int variable that holds the original health points for the player
     */
    private int OriginalHP;

    /**
     * Int variable that holds the original attack points for the player
     */
    private int OriginalAP;

    /**
     * Int varibale that holds the original heal ability of the player
     */
    private int OriginalHA;

    /**
     * Creates a player profile based on which option they choose
     *
     * @param pName  the player's name
     * @param playerChoice the profile the player chooses
     */
    public  PlayerCreature(String pName, String playerChoice){
        setPName(pName);
        if (playerChoice.equals("g")){
            setHitPoints(20);
            setAttackPoints(10);
            setHealAbility(5);
            setOriginalHP(20);
            setOriginalAP(10);
            setOriginalHA(5);
        }else if (playerChoice.equals("f")){
            setHitPoints(30);
            setAttackPoints(5);
            setHealAbility(5);
            setOriginalHP(30);
            setOriginalAP(5);
            setOriginalHA(5);
        }
    }

    /**
     * Increased the player's maximum health points when they evolve
     *
     * @param playerCreature the player that is evolving
     */
    public void hpEvolved(PlayerCreature playerCreature){
        HPEvolution playerCreature2=new HPEvolution(playerCreature);
        playerCreature2.setOriginalHP(5);
        System.out.println("The player has evolved and max hit points has been increased to "+playerCreature2.getOriginalHP()+ ".");
    }

    /**
     * Sets the name of the player creature
     *
     * @param name the String that holds the name of the player creature
     */
    public void setPName(String name){
        playerName=name;
    }

    /**
     * Gets the name of the player creature
     *
     * @return the String that holds the name of the player creature
     */
    public String getPName(){
        return playerName;
    }

    /**
     * Sets the health points of the player creature
     *
     * @param hp health points, or hitpoints, should be higher than 0, else it makes no sense
     */
    public void setHitPoints(int hp){
        playerHP=hp;
    }

    /**
     * Gets the health points of the player creature
     *
     * @return the health points of the player creature
     */
    public int getHitPoints(){
        return playerHP;
    }

    /**
     * Sets the attack points of the player creature
     *
     * @param ap attack points, should be higher than 0, else it makes no sense
     */
    public void setAttackPoints(int ap){
        playerAttackPoints=ap;
    }

    /**
     * Gets the attack points of the player creature
     *
     * @return the attack points of the player creature
     */
    public int getAttackPoints(){
        return playerAttackPoints;
    }

    /**
     * Sets the value of the player's heal ability, this determines how much damage the player can heal
     *
     * @param ha heal ability, can be 0, but should not be negative, else it makes no sense
     */
    public void setHealAbility(int ha){
        playerHealAbility=ha;
    }

    /**
     * Gets the value of the player's heal ability
     *
     * @return the value of the player's heal ability
     */
    public int getHealAbility(){
        return playerHealAbility;
    }

    /**
     * Sets the value of the player's original health points
     *
     * @param hp value of the player's original health points
     */
    public void setOriginalHP(int hp){
        OriginalHP=hp;
    }

    /**
     * Gets the value of the player's original health points
     *
     * @return the value of the player's original health points
     */
    public int getOriginalHP(){
        return OriginalHP;
    }

    /**
     * Sets the value of the player's original attack points
     *
     * @param ap value of the player's original attack points
     */
    public void setOriginalAP(int ap){
        OriginalAP=ap;
    }

    /**
     * Gets the value of the player's original attack points
     *
     * @return the value of the player's original attack points
     */
    public int getOriginalAP(){
        return OriginalAP;
    }

    /**
     * Sets the value of the player's original heal ability
     *
     * @param hb value of the player's original heal ability
     */
    public void setOriginalHA(int hb){
        OriginalHA=hb;
    }

    /**
     *Gets the value of the player's original heal ability
     *
     * @return the value of the player's original heal ability
     */
    public int getOriginalHA(){
        return OriginalHA;
    }
}