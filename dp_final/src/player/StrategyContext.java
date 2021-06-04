package player;

import creatures.Creature;

/**
 * Strategy for combat
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class StrategyContext {
    /**
     * The attack the player chose
     */
    private PlayerAttackStrategy strategy;

    /**
     * Which attack the player uses
     *
     * @param strategy
     */
    public StrategyContext(PlayerAttackStrategy strategy){
        this.strategy=strategy;
    }

    /**
     * Execute the attack strategy
     *
     * @param p the player creature
     * @param c the current creature
     */
    public void executeStrategy(PlayerCreature p, Creature c){
        strategy.attack(p, c);
    }
}
