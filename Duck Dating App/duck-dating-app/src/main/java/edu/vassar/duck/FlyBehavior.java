package edu.vassar.duck;

/**
 * Defines the fly method.
 */
public interface FlyBehavior {

/**
 * Indicates how an AquaticBird is flying.
 * @param name The AquaticBird's name
 * @param className The AquaticBird's class
 * @return A string stating how the AquaticBird is flying.
 */
    String fly(String name, String className);
}
