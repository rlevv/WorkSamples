package edu.vassar.duck;

/**
 * Represents a DecoyDuck.
 * Creates the DecoyDuck subclass of duck, which can only swim, but not quack
 * or fly
 */
public class DecoyDuck extends Duck {

/**
 * Initializes a DecoyDuck with the given name.
 * Creates an instance of DecoyDuck with the given name and initializes the
 * fly and quack behaviors.
 * @param givenName The duck's name
 */
    public DecoyDuck(final String givenName) {
        super(givenName);
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

/**
 * Initializes a DecoyDuck with a random or default name.
 */
    public DecoyDuck() {
        super();
        // Generates a default name if no unique names are left
        if (NameGenerator.namesList().isEmpty()) {
          name = "Decoy" + uniqueNumber;
          uniqueNumber++;
        } else { // generates a unique name from the list
            NameGenerator randName = new NameGenerator();
            name = randName.nameGenerator();
            uniqueNumber++;
        }
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }
}
