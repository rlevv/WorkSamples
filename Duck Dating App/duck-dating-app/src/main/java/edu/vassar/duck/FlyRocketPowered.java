package edu.vassar.duck;

/**
 * FlyBehavior for birds that fly like rockets.
 * Has a function that indicates the bird can fly like a rocket
 */
public class FlyRocketPowered implements FlyBehavior {

/**
 * Indicates that an AquaticBird can fly like a rocket.
 */
    @Override
    public String fly(final String name, final String className) {
        String output = "I am " + name + " of class "
                + className + " and I can fly like a rocket";
        //prints output so the user can see it
        System.out.println(output);
        //returns output incase another function needs it
        return output;
    }
}
