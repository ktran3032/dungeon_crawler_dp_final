package creatures;

/**
 * The base of each creature
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public abstract class Creature {
    /**
     * String variable that holds the creature name
     */
    private String creatureName;

    /**
     * Int variable that holds the health value of the creature
     */
    private int hitPoints;

    /**
     * Int variable that holds the amount of damage the creature can deal
     */
    private int attackPoints;

    /**
     * Int variable that holds the amount the damage creature can heal
     */
    private int healAbility;

    /**
     * Gets the name of the creature
     *
     * @return the name of the creature
     */
    public String getCreatureName(){
        return creatureName;
    }

    /**
     * Sets the name of the creature
     *
     * @param name what ever you want the creature name to be
     */
    public void setCreatureName(String name){
        creatureName=name;
    }

    /**
     * Gets the value of the creature's health points
     *
     * @return the value of the creature's health points
     */
    public int getHitPoints(){
        return hitPoints;
    }

    /**
     * Sets the value of the creature's health points, this determines how much damage the creature can
     * sustain
     *
     * @param hp health points, or hitpoints, should be higher than 0, else it makes no sense
     */
    public void setHitPoints(int hp){
        hitPoints=hp;
    }

    /**
     * Gets the value of the creature's attack points
     *
     * @return the value of the creature's attack points
     */
    public int getAttackPoints(){
        return attackPoints;
    }

    /**
     * Sets the value of the creature's attack points, this determines how much damage the creature will do to
     * the player
     *
     * @param ap attack points, should be higher than 0, else it makes no sense
     */
    public void setAttackPoints(int ap){
        attackPoints=ap;
    }

    /**
     * Gets the value of the creature's heal ability, how much damage the creature can heal
     *
     * @return
     */
    public int getHealAbility(){
        return healAbility;
    }

    /**
     * Sets the value of the creature's heal ability, this determines how much damage the creature can heal
     *
     * @param ha heal ability, can be 0, but should not be negative, else it makes no sense
     */
    public void setHealAbility(int ha){
        healAbility=ha;
    }
}
