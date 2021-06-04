package board;

/**
 * The builder of environments
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public interface EnvironmentBuilder {
    /**
     * builds the name/type of the environment
     */
    public void buildEnvironment();

    /**
     * builds the buff of the environment
     */
    public void buildEnvironmentBuff();

    /**
     * gets the environment that was built
     * @return the environment that was built
     */
    public Environment getEnvironment();
}
