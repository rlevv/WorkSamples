package edu.vassar.duck;

import java.util.Comparator;

/**
 * Compares AquaticBirds by size.
 * Has a function that compares two AquaticBirds and whichever is smaller
 * is ordered first
 */
public class SizeCompare implements Comparator<AquaticBird> {

/**
* Compares two AquaticBirds' sizes.
* @param b1 AquaticBird to be compared
* @param b2 AquaticBird to be compared
* @return A negative integer if b1<b2, positive integer if b1>b2, or 0 if b1=b2
*/
    public final int compare(final AquaticBird b1, final AquaticBird b2) {
        if (b1.size < b2.size) {
            return -1;
        } else if (b1.size > b2.size) {
            return 1;
        } else {
            return 0;
        }
    }
}
