package edu.vassar.duck;

import java.util.Random;
import java.awt.Color;

/**
 * Generates a random color.
 */
public class ColorGenerator {

/**
* Randomly generates a Color from 10 options.
* @return The randomly generated Color
*/
    public Color genColor() {
        Random rand = new Random();
        int colorDet = rand.nextInt(10);
        Color color = new Color(0);

        switch (colorDet) {
            case 0: color = Color.BLUE;
                    break;
            case 1: color = Color.CYAN;
                    break;
            case 2: color = Color.DARK_GRAY;
                    break;
            case 3: color = Color.GRAY;
                    break;
            case 4: color = Color.GREEN;
                    break;
            case 5: color = Color.LIGHT_GRAY;
                    break;
            case 6: color = Color.MAGENTA;
                    break;
            case 7: color = Color.ORANGE;
                    break;
            case 8: color = Color.PINK;
                    break;
            case 9: color = Color.RED;
                    break;
            default: color = Color.RED;
        }
        return color;
    }
}
