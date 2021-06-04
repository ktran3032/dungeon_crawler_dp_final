package gameAI;
import creatures.*;
import player.*;

/**
 * The AI for the ground creatures
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class GroundAI extends GameAI{
    /**
     * The attack mechanic of the ground creature to determine the new current health of the player
     *
     * @param newCreature creature involved with the attack
     * @param newPlayerCreature player involved with the attack
     */
    @Override
    public void attack(Creature newCreature, PlayerCreature newPlayerCreature) {
        creature=newCreature;
        playerCreature=newPlayerCreature;
        playerCreature.setHitPoints(playerCreature.getHitPoints()-creature.getAttackPoints());
        System.out.println("Creature attacked Player with ground attack");
    }
}
