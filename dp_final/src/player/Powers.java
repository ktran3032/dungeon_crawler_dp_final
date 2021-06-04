package player;

/**
 * The main class that will start the game
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class Powers {
    /**
     * Power up for attack points
     */
    private PowerUp attackPowerUp;

    /**
     * Power up for heal ability
     */
    private PowerUp healAbilityPowerUp;

    /**
     * Powers up the attributes of the player
     */
    public Powers(){
        attackPowerUp = new AttackPowerUp();
        healAbilityPowerUp = new HealAbilityPowerUp();
    }

    /**
     * Sets the power up for attack points
     *
     * @param player Player receiving the power up
     */
    public void setAttackPowerUp(PlayerCreature player){
        attackPowerUp.powerUp(player);
    }

    /**
     * Sets the power up for the heal ability
     *
     * @param player Player receiving the power up
     */
    public void setHealAbilityPowerUp(PlayerCreature player){
        healAbilityPowerUp.powerUp(player);
    }
}