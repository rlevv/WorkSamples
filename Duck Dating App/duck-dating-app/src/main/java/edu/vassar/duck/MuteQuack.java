package edu.vassar.duck;

/**
 * QuackBehavior for birds that can't quack.
 * Has a function that says the bird can't quack
 */
public class MuteQuack implements QuackBehavior {
/**
 * Indicates that an AquaticBird can't quack.
 */
    @Override
    public String quack(final String name, final String className) {
      String output = "I can't quack says " + name + " of the "
                + className + " class of ducks.";
      //prints output so the user can see it
      System.out.println(output);
      //returns output incase another function needs it
      return output;
    }
}
