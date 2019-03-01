package edu.vassar.duck;

/**
 * QuackBehavior for birds that squeak.
 * Has a function that says the bird can squeak
 */
public class Squeak implements QuackBehavior {
/**
 * Indicates that an AquaticBird squeaks.
 */
    @Override
    public String quack(final String name, final String className) {
      String output = "Squeak! Squeak! says " + name + " of the "
                + className + " class of ducks.";
      //prints output so the user can see it
      System.out.println(output);
      //returns output incase another function needs it
      return output;
    }
}
