package board;

/**
 * The cloud environment which buffs the creature's attack points
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class Clouds implements EnvironmentBuilder{
    /**
     * Environment variable for cloud environment
     */
    private Environment environment;

    /**
     * Initializes new environment for cloud
     */
    public Clouds(){
        this.environment=new Environment();
    }

    /**
     * Sets the name of the environment
     */
    public void buildEnvironment() {
        environment.setEnvironment("Clouds");
    }

    /**
     * Sets the buff value of the environment and a description of the buff
     */
    public void buildEnvironmentBuff() {
        environment.setEnvironmentBuff("attack buff: 5 points",5);
    }

    /**
     * Gets the environment, which is the name, the buff value and the description of the buff
     */
    public Environment getEnvironment() {
        return this.environment;
    }
}
