package creatures;

/**
 * The creature factory that produces a creature based on the specifications passed to it, in this case, the
 * letter 'g', for ground, or the letter 'f', for flying
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public class CreaturesFactory {
    /**
     * Method which creates the creatures based on specifications
     *
     * @param creatureType a String to help the factory decide which type of creature to produce
     */
    public Creature makeCreature(String creatureType){
        Creature newCreature=null;
        if (creatureType.equalsIgnoreCase("GROUND")){
            return new GroundCreatures();
        }else if(creatureType.equalsIgnoreCase("FLYING")){
            return new FlyingCreatures();

        }else{
            return null;
        }

    }
}
