package settings;

import board.Board;

/**
 * The easy difficulty
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class EasyDifficulty implements DifficultyState {
    /**
     * Shows what the current difficulty is
     *
     * @param ctx what the difficulty is being changed to
     * @return the current difficulty after being changed
     */
    @Override
    public String alert(DifficultyStateContext ctx) {
        return Board.DifficultySetting.EASY.toString();
    }
}
