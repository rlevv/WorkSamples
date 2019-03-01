package edu.vassar.duck;

/**
 * Represents a MallardDuck.
 * Creates the MallardDuck subclass of duck, which can swim, quack, or fly
 */
public class MallardDuck extends Duck {

/**
 * Initializes a MallardDuck with the given name.
 * Creates an instance of MallardDuck with the given name and initializes the
 * fly and quack behaviors.
 * @param givenName The duck's name
 */
    public MallardDuck(final String givenName) {
      super(givenName);
      quackBehavior = new Quack();
      flyBehavior = new FlyWithWings();
    }

/**
 * Initializes a MallardDuck with a random or default name.
 */
    public MallardDuck() {
      super();
      // Generates a default name if no unique names are left
      if (NameGenerator.namesList().isEmpty()) {
        name = "Mallard" + uniqueNumber;
        uniqueNumber++;
      } else { // generates a unique name from the list
          NameGenerator randName = new NameGenerator();
          name = randName.nameGenerator();
          uniqueNumber++;
      }
      quackBehavior = new Quack();
      flyBehavior = new FlyWithWings();
    }
}
