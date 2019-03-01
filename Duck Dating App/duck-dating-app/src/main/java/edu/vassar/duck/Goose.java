package edu.vassar.duck;

/**
 * Represents a Goose.
 * Creates the Goose subclass of AquaticBird, which can fly and honk
 */
public class Goose extends AquaticBird {

/**
 * Initializes a Goose with the given name.
 * Creates an instance of Goose with the given name and initializes the
 * fly and quack behaviors.
 * @param givenName The goose's name
 */
    public Goose(final String givenName) {
      super(givenName);
      quackBehavior = new Honk();
      flyBehavior = new FlyWithWings();
    }

/**
 * Initializes a Goose with a random or default name.
 */
    public Goose() {
      super();
      // Generates a default name if no unique names are left
      if (NameGenerator.namesList().isEmpty()) {
        name = "Goose" + uniqueNumber;
        uniqueNumber++;
      } else { // generates a unique name from the list
          NameGenerator randName = new NameGenerator();
          name = randName.nameGenerator();
          uniqueNumber++;
      }
      quackBehavior = new Honk();
      flyBehavior = new FlyWithWings();
    }
}
