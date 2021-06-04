package player;

/**
 * The evolution of health points for the player
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class HPEvolution extends PlayerAbilities{
    /**
     * Makes a copy of the player's current stats
     *
     * @param newPlayer what player object to copy to get the current stats
     */
    public HPEvolution(Player newPlayer) {
        super(newPlayer);
    }

    /**
     * Sets the value of how much we want the player's health points gets increased by
     *
     * @param hp how much the player's health points gets increased by
     */
    public void setHitPoints(int hp){
        tempPlayer.setHitPoints(tempPlayer.getHitPoints()+hp);
    }

    /**
     * Sets the original health points of the player
     *
     * @param hp the hp of the player creature
     */
    public void setOriginalHP(int hp) {
        tempPlayer.setOriginalHP(tempPlayer.getOriginalHP()+hp);
    }

    /**
     * Gets the original health points of the player
     *
     * @return the hp of the player creature
     */
    public int getOriginalHP() {
        return tempPlayer.getOriginalHP();
    }

    /**
     *Gets the value of the player's health points
     *
     * @return the value of the player's health points
     */
    public int getHitPoints(){
        return tempPlayer.getHitPoints();
    }
}
