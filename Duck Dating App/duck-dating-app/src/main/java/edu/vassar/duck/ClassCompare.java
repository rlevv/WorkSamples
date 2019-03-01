package edu.vassar.duck;

import java.util.Comparator;

/**
 * Compares AquaticBirds by class.
 * Has a function that compares two AquaticBirds and whichever class is first
 * alphabetically is ordered first
 */
public class ClassCompare implements Comparator<AquaticBird> {

/**
* Compares two AquaticBirds' classes alphabetically.
* @param b1 AquaticBird to be compared
* @param b2 AquaticBird to be compared
* @return A negative integer if b1<b2, positive integer if b1>b2, or 0 if b1=b2
*/
    public final int compare(final AquaticBird b1, final AquaticBird b2) {
        return b1.className.compareTo(b2.className);
    }
}
