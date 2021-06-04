package settings;

/**
 * The way the state pattern is accessed
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class DifficultyStateContext{
    /**
     * DifficultyState variable for the DifficultyStateContext
     */
    private DifficultyState currentDifficulty;

    /**
     * Default difficulty of the game
     */
    public DifficultyStateContext(){
        currentDifficulty=new EasyDifficulty();
    }

    /**
     * Sets the difficulty of the game
     *
     * @param newDifficulty the new difficulty that the game to be
     */
    public void setDifficulty(DifficultyState newDifficulty){
        currentDifficulty=newDifficulty;
    }

    /**
     * Shows what the current difficulty is
     *
     * @return the current difficulty
     */
    public String alert(){
        return currentDifficulty.alert(this);
    }
}
