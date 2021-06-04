package settings;

/**
 * The interface for the different types of difficulties
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public interface DifficultyState {
    /**
     * Shows what the current difficulty is
     *
     * @param ctx the difficulty
     */
    public String alert(DifficultyStateContext ctx);
}
