package creatures;

/**
 * The ground creature
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class GroundCreatures extends Creature {
    public GroundCreatures(){
        /**
         * Name of the ground creature
         */
        setCreatureName("Ground Creature");

        /**
         * Attack points of the creature
         */
        setAttackPoints(5);

        /**
         * Health points of the creature
         */
        setHitPoints(20);

        /**
         * Heal ability value for the creature
         */
        setHealAbility(2);

    }
}
