package edu.vassar.duck;

/**
 * Defines the quack method.
 */
public interface QuackBehavior {
/**
 * Indicates how an AquaticBird is quacking.
 * @param name The AquaticBird's name
 * @param className The AquaticBird's class
 * @return A string stating how the AquaticBird is quacking.
 */
    String quack(String name, String className);
}
