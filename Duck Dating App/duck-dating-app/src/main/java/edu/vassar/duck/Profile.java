package edu.vassar.duck;
import java.util.Random;

/**
 * Stores an AquaticBird's preferences.
 * Generates randonly assigned values to a series of preferences for different
 * classes, sizes, and colors of AquaticBirds
 */
public class Profile {

/**
 * Used to generate preferences.
 */
  private PrefGen generator;

/**
 * Stores the AquaticBird's class preferences.
 */
  private int[] typePref;

/**
 * Stores the AquaticBird's size preferences.
 */
  private int[] sizePref;

/**
 * Stores the AquaticBird's color preferences.
 */
  private int[] colorPref;

/**
 * Stores the AquaticBird's favorite letter.
 */
  private char letPref;

/**
 * Randomly assigns preferences for different classes, sizes, and colors of
 * AquaticBirds.
 */
  public Profile() {
    generator = new TypePrefGen();
    typePref = generator.prefScores();

    generator = new SizePrefGen();
    sizePref = generator.prefScores();

    generator = new ColorPrefGen();
    colorPref = generator.prefScores();

    Random random = new Random();
    char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    letPref = letters[random.nextInt(letters.length)];
  }

/**
 * Accessor for typePref.
 * @return The values of typePref
 */
 public int[] typePref() {
   return typePref;
 }

/**
 * Accessor for sizePref.
 * @return The values of sizePref
 */
 public int[] sizePref() {
   return sizePref;
 }

/**
 * Accessor for colorPref.
 * @return The values of colorPref
 */
 public int[] colorPref() {
   return colorPref;
 }

/**
 * Accessor for letPref.
 * @return The value of letPref
 */
 public char letPref() {
   return letPref;
 }

}
