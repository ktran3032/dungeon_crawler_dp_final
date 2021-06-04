package creatures;

/**
 * The flying creature
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class FlyingCreatures extends Creature {
    public FlyingCreatures(){
        /**
         * Name of the flying creature
         */
        setCreatureName("Flying Creature");

        /**
         * Attack points of the creature
         */
        setAttackPoints(5);

        /**
         * Health points of the creature
         */
        setHitPoints(10);

        /**
         * Heal ability value for the creature
         */
        setHealAbility(4);

    }
}
