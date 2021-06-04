package board;

/**
 * The creator of environments
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class EnvironmentCreator {
    /**
     * Instance of environment for the new environment being created
     */
    private EnvironmentBuilder environmentBuilder;

    /**
     * Constructor for the EnvironmentCreator
     *
     * @param newEnvironmentBuilder the EnvironmentBuilder that the Creator will use and modify
     */
    public EnvironmentCreator(EnvironmentBuilder newEnvironmentBuilder){
        this.environmentBuilder=newEnvironmentBuilder;
    }

    /**
     *Gets the environment along with its attributes
     *
     * @return the environment along with its attributes
     */
    public Environment getEnvironment(){
        return this.environmentBuilder.getEnvironment();
    }

    /**
     * Creates the environment by setting the name/type and the buff
     */
    public void constructEnvironment(){
        this.environmentBuilder.buildEnvironment();
        this.environmentBuilder.buildEnvironmentBuff();
    }

}
