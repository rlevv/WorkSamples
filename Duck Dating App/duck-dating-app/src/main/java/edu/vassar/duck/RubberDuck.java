package edu.vassar.duck;

/**
 * Represents a RubberDuck.
 * Creates the RubberDuck subclass of duck, which can swim and quack, but not
 * fly
 */
public class RubberDuck extends Duck {

/**
 * Initializes a RubberDuck with the given name.
 * Creates an instance of RubberDuck with the given name and initializes the
 * fly and quack behaviors.
 * @param givenName The duck's name
 */
    public RubberDuck(final String givenName) {
      super(givenName);
      quackBehavior = new Squeak();
      flyBehavior = new FlyNoWay();
    }

/**
 * Initializes a RubberDuck with a random or default name.
 */
    public RubberDuck() {
      super();
      // Generates a default name if no unique names are left
      if (NameGenerator.namesList().isEmpty()) {
        name = "Rubber" + uniqueNumber;
        uniqueNumber++;
      } else { // generates a unique name from the list
          NameGenerator randName = new NameGenerator();
          name = randName.nameGenerator();
          uniqueNumber++;
      }
      quackBehavior = new Squeak();
      flyBehavior = new FlyNoWay();
    }
}
