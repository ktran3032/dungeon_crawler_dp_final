package board;

/**
 * The forest environment which buffs the creature's health points
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class Forest implements EnvironmentBuilder{
    /**
     * Environment variable for forest environment
     */
    private Environment environment;

    /**
     * Initializes new environment for cloud
     */
    public Forest(){
        this.environment=new Environment();
    }

    /**
     * Sets the name of the environment
     */
    public void buildEnvironment() {
        environment.setEnvironment("Forest");
    }

    /**
     * Sets the buff value of the environment and a description of the buff
     */
    public void buildEnvironmentBuff() {
        environment.setEnvironmentBuff("hp buff: 5 points",5);
    }

    /**
     * Gets the environment, which is the name, the buff value and the description of the buff
     */
    public Environment getEnvironment() {
        return this.environment;
    }
}
