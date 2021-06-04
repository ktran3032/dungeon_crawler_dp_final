package gameAI;
import creatures.*;
import player.*;

/**
 * The base of the AIs
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public abstract class GameAI {
    /**
     * The creature that will face off against the player
     */
    protected Creature creature;

    /**
     * The player that will face off against the creature
     */
    protected PlayerCreature playerCreature;

    /**
     * The heal mechanic of the battle to determine the new current health of the creature/player
     *
     * @param newCreature creature whose heal ability will be used
     */
    public void heal(Creature newCreature) {
        creature=newCreature;
        creature.setHitPoints(creature.getHitPoints()+creature.getHealAbility());
        System.out.println("creature healed itself");

    }

    /**
     * The idle mechanic for the creature
     */
    public void doNothing(){
        System.out.println("Creature did nothing");
    }

    /**
     * The attack mechanic of the creature to determine the new current health of the creature/player
     *
     * @param newCreature creature involved with the attack
     * @param newPlayerCreature player involved with the attack
     */
    public abstract void attack(Creature newCreature,PlayerCreature newPlayerCreature);


}
