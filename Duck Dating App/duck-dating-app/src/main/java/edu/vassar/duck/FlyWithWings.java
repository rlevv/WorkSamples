package edu.vassar.duck;

/**
 * FlyBehavior for birds that fly with wings.
 * Has a function that indicates the bird can fly with their wings
 */
public class FlyWithWings implements FlyBehavior {

/**
 * Indicates that an AquaticBird can fly with their wings.
 */
    @Override
    public String fly(final String name, final String className) {
        String output = "I am " + name + " of class "
                + className + " and I can fly with my wings.";
        //prints output so users can see it
        System.out.println(output);
        //returns output incase another function needs to use it
        return output;
    }
}
