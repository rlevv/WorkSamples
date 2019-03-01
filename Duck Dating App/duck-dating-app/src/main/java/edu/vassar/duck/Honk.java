package edu.vassar.duck;

/**
 * QuackBehavior for birds that honk.
 * Has a function that says the bird can quack
 */
public class Honk implements QuackBehavior {

/**
 * Stores a Counter for honks.
 */
    private Counter honks = new Counter();

/**
 * Indicates that an AquaticBird honks.
 */
    @Override
    public String quack(final String name, final String className) {
      String output = "Honk! Honk! Honk! says " + name + " of the "
                    + className + " class";

      //prints output so the user can see it
      System.out.println(output);
      honks.newHonk();
      //returns output incase another function needs it
      return output;
    }
}
