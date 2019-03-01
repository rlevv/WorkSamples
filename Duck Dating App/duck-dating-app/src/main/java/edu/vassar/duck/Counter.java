package edu.vassar.duck;

/**
 * Counts the number of quacks and honks for all ducks and geese.
 */
public class Counter {
/**
 * Stores the number of quacks.
 */
    private static int quacks;
/**
 * Stores the number of honks.
 */
    private static int honks;

/**
 * Increments the quack count.
 */
    public void newQuack() {
        quacks++;
    }

/**
 * Increments the honk count.
 */
    public void newHonk() {
        honks++;
    }

/**
 * Accessor for quacks.
 * @return The number of quacks thus far
 */
    public int returnQuackNum() {
        return quacks;
    }

/**
 * Accessor for honks.
 * @return The number of honks thus far
 */
    public int returnHonkNum() {
        return honks;
    }
}
