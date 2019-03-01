package edu.vassar.duck;

/**
 * Represents a ModelDuck.
 * Creates the ModelDuck subclass of duck, which can swim, quack, or fly
 * (either with rockets or wings, which is switched with setFlyMode).
 */
public class ModelDuck extends Duck {

/**
 * Initializes a ModelDuck with the given name.
 * Creates an instance of ModelDuck with the given name and initializes the
 * fly and quack behaviors.
 * @param givenName The duck's name
 */
    public ModelDuck(final String givenName) {
      super(givenName);
      quackBehavior = new Quack();
      flyBehavior = new FlyWithWings();
    }

/**
 * Initializes a ModelDuck with a random or default name.
 */
    public ModelDuck() {
      super();
      // Generates a default name if no unique names are left
      if (NameGenerator.namesList().isEmpty()) {
        name = "Model" + uniqueNumber;
        uniqueNumber++;
      } else { // generates a unique name from the list
          NameGenerator randName = new NameGenerator();
          name = randName.nameGenerator();
          uniqueNumber++;
      }
      quackBehavior = new Quack();
      flyBehavior = new FlyWithWings();
    }

/**
 * Changes the duck's flyBehavior.
 * @param mode Indicates the new fly mode
 */
    public void setFlyMode(final String mode) {
      if (mode.equals("wings")) {
        flyBehavior = new FlyWithWings();
      } else if (mode.equals("rocket")) {
          flyBehavior = new FlyRocketPowered();
      }
    }
}
