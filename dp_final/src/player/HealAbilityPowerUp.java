package player;

/**
 * The class that powers up the heal ability
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class HealAbilityPowerUp implements PowerUp{
    /**
     * Powers up the player's heal ability
     *
     * @param player the player whose heal ability is being powered up
     */
    public void powerUp(PlayerCreature player) {
        PlayerCreature pc = player;
        System.out.println("You chose to power up your heal ability but your attack power will become weaker.");
        pc.setAttackPoints(pc.getOriginalAP()-2);
        pc.setHealAbility(pc.getOriginalHA()+2);
    }
}
