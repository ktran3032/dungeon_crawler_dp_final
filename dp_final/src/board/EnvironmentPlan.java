package board;

/**
 * The interface for the environments
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public interface EnvironmentPlan {
    /**
     * Method the child class must implement in order to give the environment a name/type
     *
     * @param Environment the name/type of the environment
     */
    public void setEnvironment(String Environment);

    /**
     * Method the child class must implement in order to define the buff and the value of the buff
     *
     * @param EnvironmentBuff what the buff is going to do
     * @param buffValue the value of the buff
     */
    public void setEnvironmentBuff(String EnvironmentBuff, int buffValue);
}
