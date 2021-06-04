package player;
import creatures.Creature;

/**
 * The power based attack that the player has
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class PowerAttack implements PlayerAttackStrategy{
    /**
     * This reckless attack deals increased damage at the cost of some of the player's health
     *
     * @param newPlayer player whose stats will be used to determine the damage
     * @param newCreature creature that is battling the player, whose health will be reduced
     */
    public void attack(PlayerCreature newPlayer, Creature newCreature) {
        PlayerCreature player=newPlayer;
        Creature creature=newCreature;
        creature.setHitPoints(creature.getHitPoints()-(player.getAttackPoints()+10));
        player.setHitPoints(player.getHitPoints()-5);
        System.out.println("Player attacked creature using a Power attack");
        System.out.println("Player HP: "+player.getHitPoints()+"\tEnemy HP: "+creature.getHitPoints()+"\n");
    }
}
