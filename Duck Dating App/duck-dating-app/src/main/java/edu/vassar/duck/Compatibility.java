package edu.vassar.duck;
import java.awt.Color;


/**
 * Used to determine compatibility of two AquaticBirds.
 * Takes two aquatic birds and based off of their Profiles creates an score
 * which represents how compatible the two aquatic birds are
 */
public class Compatibility {

/**
 * Stores the compatibility score.
 */
  private double score;
/**
 * Stores the first AquaticBird.
 */
  private AquaticBird b1;
/**
 * Stores the second AquaticBird.
 */
  private AquaticBird b2;
/**
 * Stores a bird's Profile.
 */
  private Profile p;

/**
 * Stores the possible AquaticBird classes.
 */
  private static String[] types = {"DecoyDuck", "MallardDuck", "ModelDuck",
"RedheadDuck", "RubberDuck"};
/**
 * Stores the possible AquaticBird sizes.
 */
  private static Integer[] sizes = {1, 2, 5, 10};
/**
 * Stores the possible AquaticBird colors.
 */
  private static Color[] colors = {Color.BLUE, Color.CYAN, Color.DARK_GRAY,
Color.GRAY, Color.GREEN, Color.LIGHT_GRAY, Color.MAGENTA, Color.ORANGE,
Color.PINK, Color.RED};

/**
 * Calculates the compatibility score for the given AquaticBirds.
 * @param bird1 The first AquaticBird
 * @param bird2 The second AquaticBird
 */
  public Compatibility(final AquaticBird bird1, final AquaticBird bird2) {
    this.b1 = bird1;
    this.b2 = bird2;
    p = b1.profile();

    double typeScore = calculate(types, p.typePref(), b2.className());
    double sizeScore = calculate(sizes, p.sizePref(), b2.size());
    double colorScore = calculate(colors, p.colorPref(), b2.color());
    boolean letPref = letPref(p.letPref());

    score = (typeScore + sizeScore + colorScore) / 3;
    if (letPref) {
      score += score / 10;
    }
    if (score > 100) {
      score = 100;
    }
  }

/**
 * Calculates the individual compatibility scores for specific preferences.
 * @param choices All possible options for the particular preference
 * @param prefs The preference values corresponding to each option
 * @param item The characteristic being evaluated
 * @return The preference value for the given characteristic
 */
  private int calculate(final Object[] choices, final int[] prefs,
final Object item) {
    int value = 0;
    for (int i = 0; i < choices.length; i++) {
      if (choices[i].equals(item)) {
        value = prefs[i]; break;
      }
    }
    return value;
  }

/**
 * Determines if the letter preference is applicable.
 * @param pref The preferred letter
 * @return Whether the letter preference is met
 */
  private boolean letPref(final char pref) {
    String name = b2.name();
    char first = name.charAt(0);
    return (pref == first);
  }

/**
 * Converts the compatibility score into a String.
 * Uses the original score to return a vague phrase on the compatibility of the
 * birds
 * @return A string representing the AquaticBirds' compatibility score
 */
  public String toString() {
    String output = Double.toString(score) + "% Compatible\n";
    if (score == 100) {
      output += "It's a perfect match!";
    } else if (score >= 75) {
        output += "Super compatible!";
    } else if (score >= 50) {
        output += "Pretty compatible!";
    } else if (score >= 25) {
        output += "Somewhat compatible!";
    } else {
        output += "Not very compatible";
    }
    return output;
  }

/**
 * Accessor for score.
 * @return The value of score
 */
 public double score() {
   return score;
 }
}
