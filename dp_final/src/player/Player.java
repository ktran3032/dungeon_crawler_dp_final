package player;

/**
 * The base for the player
 *
 * @author Erald Fejzaj, Kevin Tran, Yash Dalsania
 */

public interface Player {
   /**
    * Gets the player's name
    *
    * @return the name that the player entered
    */
   String getPName();

   /**
    * Gets the value of the player's health points
    *
    * @return the value of the player's health points
    */
   int getHitPoints();

   /**
    * Sets the value of the player's health points, this determines how much damage the player can
    * sustain
    *
    * @param hp health points, or hitpoints, should be higher than 0, else it makes no sense
    */
   void setHitPoints(int hp);

   /**
    * Gets the value of the player's attack points
    *
    * @return the value of the player's attack points
    */
   int getAttackPoints();

   /**
    * Sets the value of the player's attack points, this determines how much damage the player will do to
    * the player
    *
    * @param ap attack points, should be higher than 0, else it makes no sense
    */
   void setAttackPoints(int ap);

   /**
    * Gets the value of the player's heal ability, how much damage the player can heal
    *
    * @return
    */
   int getHealAbility();

   /**
    * Sets the value of the player's heal ability, this determines how much damage the player can heal
    *
    * @param ha heal ability, can be 0, but should not be negative, else it makes no sense
    */
   void setHealAbility(int ha);

   /**
    * Sets the value of the player's original health points
    *
    * @param hp value of the player's original health points
    */
   void setOriginalHP(int hp);

   /**
    * Gets the value of the player's original health points
    *
    * @return the value of the player's original health points
    */
   int getOriginalHP();
}
