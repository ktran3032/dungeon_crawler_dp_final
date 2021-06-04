package player;
import creatures.Creature;

/**
 * The healing based attack that the player has
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class HealAttack implements PlayerAttackStrategy{
    /**
     * This attack heals deals less damage and heals less health than normal, but does both at the same time
     *
     * @param newPlayer player whose stats will be used to determine the reduced damage and heal
     * @param newCreature creature that is battling the player, whose health will be reduced
     */
    public void attack(PlayerCreature newPlayer, Creature newCreature) {
        PlayerCreature player=newPlayer;
        Creature creature=newCreature;
        creature.setHitPoints(creature.getHitPoints()-(player.getAttackPoints()/2));
        player.setHitPoints(player.getHitPoints()+(player.getHealAbility()/2));
        System.out.println("Player attacked creature using a Heal attack");
        System.out.println("Player HP: "+player.getHitPoints()+"\tEnemy HP: "+creature.getHitPoints()+"\n");
    }
}
