package edu.vassar.duck;

import java.util.Random;

/**
 * Generates preferences for color.
 * Randomly generates a value from 1 to 100 for each possible AquaticBird color
 */
public class ColorPrefGen implements PrefGen {
    //Generates the scores
    @Override
    public int[] prefScores() {
        // array holding the scores to be returned
        int[] scores = new int[9];
        // random number generator
        Random rand = new Random();
        // assigns random value to each array slot
        for (int i = 0; i < scores.length; i++) {
            scores[i] = rand.nextInt(100) + 1;
        }
        return scores;
    }
}
