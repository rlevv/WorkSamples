package edu.vassar.duck;

/**
 * FlyBehavior for birds that can't fly.
 * Has a function that indicates the bird can't fly
 */
public class FlyNoWay implements FlyBehavior {

/**
 * Indicates that an AquaticBird can't fly.
 */
    @Override
    public String fly(final String name, final String className) {
        String output = "I am " + name + " of class "
                + className + " and I can't fly.";
        //prints output so the user can see it
        System.out.println(output);
        //returns output incase another function needs it
        return output;
    }
}
