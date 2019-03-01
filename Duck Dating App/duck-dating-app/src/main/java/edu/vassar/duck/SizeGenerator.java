package edu.vassar.duck;

import java.util.Random;

/**
 * Generates a random size.
 */
public class SizeGenerator {

/**
* Randomly generates a size: 1, 2, 5, or 10.
* @return The randomly generated size
*/
    public int genSize() {
        Random rand = new Random();
        int sizeDet = rand.nextInt(4);
        int size = 0;

        switch (sizeDet) {
            case 0: size = 1;
                    break;
            case 1: size = 2;
                    break;
            case 2: size = 5;
                    break;
            case 3: size = 10;
                    break;
            default: size = 0;
        }
        return size;
    }
}
