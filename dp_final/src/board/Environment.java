package board;

/**
 * The base of each environment
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class Environment implements  EnvironmentPlan{
    /**
     * String variable for the name of the environment
     */
    private String environment;

    /**
     * String variable to state what the buff
     */
    private String environmentBuff;

    /**
     * Int variable to hold the actual amount that the stat is getting buffed by
     */
    private int buffValue;

    /**
     * Sets the name/type of the environment
     *
     * @param newEnvironment name/type of the environment
     */
    public void setEnvironment(String newEnvironment) {
        environment=newEnvironment;
    }

    /**
     * Sets the buff value of the environment and a description of the buff
     *
     * @param newEnvironmentBuff what the buff does
     * @param newBuffValue what the value of the buff is
     */
    public void setEnvironmentBuff(String newEnvironmentBuff, int newBuffValue) {
        environmentBuff=newEnvironmentBuff;
        buffValue=newBuffValue;
    }

    /**
     * Gets the environment name/type
     *
     * @return the name/type of the environment
     */
    public String getEnvironment() {
        return environment;
    }

    /**
     * Gets the environment buff description
     *
     * @return the description of the buff that the environment gives
     */
    public String getEnvironmentBuff() {
        return environmentBuff;
    }

    /**
     * Gets the value of the buff
     *
     * @return the value of the buff that the environment gives
     */
    public int getBuffValue() {
        return buffValue;
    }
}
