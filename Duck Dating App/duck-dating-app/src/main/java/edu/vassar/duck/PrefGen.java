package edu.vassar.duck;

/**
 * Defines a  method to generate preferences for different traits.
 */
public interface PrefGen {
/**
 * Generates preference values.
 * @return An integer array representing a set of preference values
 */
    int[] prefScores();
}
