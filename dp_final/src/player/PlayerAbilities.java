package player;

/**
 * Helps with the evolution of the player
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public abstract class PlayerAbilities implements Player {
    /**
     * Holds the player creature
     */
    protected Player tempPlayer;

    /**
     * Sets the player creature
     *
     * @param newPlayer the player creature
     */
    public PlayerAbilities(Player newPlayer){
        tempPlayer=newPlayer;
    }

    /**
     * Gets the name of the player
     *
     * @return the name of the player
     */
    public String getPName(){
        return tempPlayer.getPName();
    }

    /**
     * Gets the value of the player's health points
     *
     * @return the value of the player's health points
     */
    public int getHitPoints(){
        return tempPlayer.getHitPoints();
    }

    /**
     * Sets the value of the player's health points, this determines how much damage the player can
     * sustain
     *
     * @param hp health points, or hitpoints, should be higher than 0, else it makes no sense
     */
    public void setHitPoints(int hp){
        tempPlayer.setHitPoints(hp);
    }

    /**
     * Gets the value of the player's attack points
     *
     * @return the value of the player's attack points
     */
    public int getAttackPoints(){
        return tempPlayer.getAttackPoints();
    }

    /**
     * Sets the value of the player's attack points, this determines how much damage the player will do to
     * the player
     *
     * @param ap attack points, should be higher than 0, else it makes no sense
     */
    public void setAttackPoints(int ap){
        tempPlayer.setAttackPoints(ap);
    }

    /**
     * Gets the value of the player's heal ability, how much damage the player can heal
     *
     * @return
     */
    public int getHealAbility(){
        return tempPlayer.getHealAbility();
    }

    /**
     * Sets the vale of the player's heal ability, this determines how much damage the player can heal
     *
     * @param ha heal ability, can be 0, but should not be negative, else it makes no sense
     */
    public void setHealAbility(int ha){
        tempPlayer.setHealAbility(ha);
    }
}
