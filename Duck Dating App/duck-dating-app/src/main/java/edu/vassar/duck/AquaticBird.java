package edu.vassar.duck;

import java.util.ArrayList;
import java.awt.Color;

/**
 * Represents an AquaticBird.
 * Creates the AquaticBird class witch holds a name for a given aquatic bird,
 * a className for a given aquatic bird, a uniqueNumber which allows for repeat
 * names of aquatic birds to be given a number and become unique (no number
 * will ever be reused), a list of aquatic bird names which holds all the
 * previously used aquatic bird names so none are ever repeated, the
 * flyBehavior of a aquatic bird so if/how the aquatic bird flys can be
 * returned or shown, and the quackBehavior of a aquatic bird so if/how the
 * aquatic bird quacks can be returned or shown.
 */
public class AquaticBird {

/**
 * Stores the AquaticBird's name.
 */
    protected String name;
/**
 * Stores the AquaticBird's class.
 */
    protected String className;
/**
 * Integer added to strings to make unique names.
 */
    protected static int uniqueNumber;
/**
 * ArrayList to hold used aquatic bird names.
 */
    private static ArrayList<String> names = new ArrayList<String>();
/**
 * Stores the AquaticBird's FlyBehavior.
 */
    protected FlyBehavior flyBehavior;
/**
 * Stores the AquaticBird's QuackBehavior.
 */
    protected QuackBehavior quackBehavior;
/**
 * Used to generate size.
 */
    private SizeGenerator sizeGen = new SizeGenerator();
/**
 * Stores the AquaticBird's size.
 */
    protected int size;
/**
 * Used to generate color.
 */
    private ColorGenerator colorGen = new ColorGenerator();
/**
 * Stores the AquaticBird's color.
 */
    protected Color color;
/**
 * Stores the AquaticBird's serial number.
 */
    private String serial;
/**
 * Stores the AquaticBird's profile.
 */
    protected Profile profile;

/**
 * Initializes an AquaticBird with the given name.
 * Creates an instance of AquaticBird with the given name, if it is not already
 * taken. Otherwise, generates a default name for the bird.
 * @param givenName The bird's name
 */
    public AquaticBird(final String givenName) {

        if (names.indexOf(givenName) == -1) {
            this.name = givenName;
            uniqueNumber++;
// Generates a default name if no unique names are left
        } else if (NameGenerator.namesList().isEmpty()) {
            name = givenName + uniqueNumber;
            uniqueNumber++;
 // Generates a unique name from the list
        } else {
            NameGenerator randName = new NameGenerator();
            name = randName.nameGenerator();
            uniqueNumber++;
        }

        // Add the name to the list of names
        names.add(name);

        // set className
        className = getClass().getSimpleName();
        // set serialName
        serial = this.setSerial();
        // set size
        size = sizeGen.genSize();
        // set color
        color = colorGen.genColor();
    }

/**
 * Initializes an AquaticBird.
 * Creates an instance of AquaticBird
 */
    public AquaticBird() {
        // set className
        className = getClass().getSimpleName();
        // set serialName
        serial = this.setSerial();
        // set size
        size = sizeGen.genSize();
        // initialize profile
        profile = new Profile();
        // set color
        color = colorGen.genColor();
    }

/**
 * Returns a String identifying the bird.
 * @return A String identifying the bird by name and class
 */
    public String display() {
        return "I am a " + className + ". My name is " + name + ".";
    }

/**
 * Sets the AquaticBird's FlyBehavior.
 * @param flyBehave The new FlyBehavior
 */
    public void setFlyBehavior(final FlyBehavior flyBehave) {
        flyBehavior = flyBehave;
    }

/**
 * Sets the AquaticBird's QuackBehavior.
 * @param quackBehave The new QuackBehavior
 */
    public void setQuackBehavior(final QuackBehavior quackBehave) {
        quackBehavior = quackBehave;
    }

/**
 * Indicates how the bird is quacking.
 * @return A String representing how the bird quacks
 */
    public String performQuack() {
        return quackBehavior.quack(name, className);
    }

/**
 * Sets the AquaticBird's serial number.
 * @return The new serial number
 */
    public String setSerial() {
        UniqueSerialGen serialGen = new UniqueSerialGen();
        return serialGen.uniqueGenerator();
    }

/**
 * Indicates how the bird is flying.
 * @return A String representing how the bird flies
 */
    public String performFly() {
        return flyBehavior.fly(name, className);
    }

/**
 * Calculates the compatibility score between this AquaticBird and another.
 * @param other The AquaticBird being compared
 * @return The compatibility score
 */
    public double checkCompatibility(final AquaticBird other) {
      Compatibility c = new Compatibility(this, other);
      return c.score();
    }

    //Override the equals method
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof AquaticBird)) {
            return false;
        }

        AquaticBird aquaBird = (AquaticBird) o;

        return aquaBird.name.equals(name)
                && aquaBird.className.equals(className)
                && (aquaBird.size == size)
                && aquaBird.color.equals(color)
                && aquaBird.serial.equals(serial)
                && aquaBird.flyBehavior.equals(flyBehavior)
                && aquaBird.quackBehavior.equals(quackBehavior);
    }

    // Override hashcode
    @Override
    public int hashCode() {
        int result = 12;
        result = 14 * result + name.hashCode();
        result = 14 * result + size;
        result = 14 * result + className.hashCode();
        return result;
    }

/**
 * Accessor for name.
 * @return The value of name
 */
 public String name() {
   return name;
 }

/**
 * Accessor for className.
 * @return The value of className
 */
 public String className() {
   return className;
 }

/**
 * Accessor for size.
 * @return The value of size
 */
 public int size() {
   return size;
 }

/**
 * Accessor for color.
 * @return The value of color
 */
 public Color color() {
   return color;
 }

/**
 * Accessor for profile.
 * @return The value of profile
 */
 public Profile profile() {
   return profile;
 }

}
