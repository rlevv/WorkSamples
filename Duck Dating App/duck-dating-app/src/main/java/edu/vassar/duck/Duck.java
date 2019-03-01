package edu.vassar.duck;

/**
 * Represents a Duck.
 * Creates the Duck subclass of AquaticBird, which lets all other types of
 * ducks swim
 */
public abstract class Duck extends AquaticBird {


/**
 * Initializes a Duck with the given name.
 * @param givenName The duck's name
 */
    public Duck(final String givenName) {
      super(givenName);
    }

/**
 * Initializes a Duck with a random or default name.
 */
    public Duck() {
        super();
    }

/**
 * Indicates that the duck is swimming.
 * @return A String stating that the duck is swimming
 */
    public String swim() {
        // String holding the proper output
        String output = "I am " + name + " of the " + className
                + " class of ducks, and I am swimming.";

        // Prints the output
        System.out.println(output);

        //Returns the output for non-printing uses
        return output;
    }
}
