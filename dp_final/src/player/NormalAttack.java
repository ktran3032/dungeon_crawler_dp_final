package player;
import creatures.Creature;

/**
 * The normal style attack that the player has
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class NormalAttack implements PlayerAttackStrategy{
    /**
     * This attack deals the normal amount of damage equal to the player's attack power
     *
     * @param newPlayer player whose stats will be used to determine the damage
     * @param newCreature creature that is battling the player, whose health will be reduced
     */
    public void attack(PlayerCreature newPlayer, Creature newCreature) {
        PlayerCreature player=newPlayer;
        Creature creature=newCreature;
        creature.setHitPoints(creature.getHitPoints()-player.getAttackPoints());
        System.out.println("Player attacked creature using a normal attack");
        System.out.println("Player HP: "+player.getHitPoints()+"\tEnemy HP: "+creature.getHitPoints()+"\n");
    }
}
