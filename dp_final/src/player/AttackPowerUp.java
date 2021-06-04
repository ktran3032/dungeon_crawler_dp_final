package player;

/**
 * The class that powers up the attack points
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class AttackPowerUp implements PowerUp {
    /**
     * Powers up the player's attack
     *
     * @param player the player whose attack is being powered up
     */
    public void powerUp(PlayerCreature player) {
        PlayerCreature pc = player;
        System.out.println("You chose to power up your attack but your heal ability will become weaker.");
        pc.setAttackPoints(pc.getOriginalAP()+2);
        pc.setHealAbility(pc.getOriginalHA()-2);
    }
}
