package edu.vassar.duck;

/**
 * Represents a RedheadDuck.
 * Creates the RedheadDuck subclass of duck, which can swim, quack, or fly
 */
public class RedheadDuck extends Duck {

/**
 * Initializes a RedheadDuck with the given name.
 * Creates an instance of RedheadDuck with the given name and initializes the
 * fly and quack behaviors.
 * @param givenName The duck's name
 */
    public RedheadDuck(final String givenName) {
      super(givenName);
      quackBehavior = new Quack();
      flyBehavior = new FlyWithWings();
    }

/**
 * Initializes a RedheadDuck with a random or default name.
 */
    public RedheadDuck() {
      super();
      // Generates a default name if no unique names are left
      if (NameGenerator.namesList().isEmpty()) {
        name = "Redhead" + uniqueNumber;
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

