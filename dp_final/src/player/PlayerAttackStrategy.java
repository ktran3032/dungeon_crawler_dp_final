package player;
import creatures.Creature;

/**
 * The interface for the different types of the player
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public interface PlayerAttackStrategy {
    /**
     * Method for the base of an attack, there will be multiple styles of attacks
     *
     * @param player player from which the attack is coming from
     * @param creature creature receiving the attack
     */
    void attack(PlayerCreature player, Creature creature);
}
