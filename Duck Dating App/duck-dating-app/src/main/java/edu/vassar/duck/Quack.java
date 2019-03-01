package edu.vassar.duck;

/**
 * QuackBehavior for birds that quack.
 * Has a function that says the bird can quack
 */
public class Quack implements QuackBehavior {

/**
 * Stores a Counter for quacks.
 */
    private Counter quacks = new Counter();

/**
 * Indicates that an AquaticBird quacks.
 */
    @Override
    public String quack(final String name, final String className) {
      String output = "Quack! Quack! Quack! says " + name + " of the "
                    + className + " class of ducks.";
      //prints output so the user can see it
      System.out.println(output);
      quacks.newQuack();
      //returns output incase another function needs it
      return output;
    }
}
