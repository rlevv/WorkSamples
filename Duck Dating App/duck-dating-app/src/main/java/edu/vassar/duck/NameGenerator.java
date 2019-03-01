package edu.vassar.duck;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 * Generates a random name.
 */
public class NameGenerator {

/**
 * Holds all possible names.
 */
    public static final String[] NAMES = new String[]{"Michael", "Arlen",
        "Antoine", "Dan", "Al", "Francisco", "Terry", "Floyd", "Stephen",
        "Grover", "Ward", "Parker", "Earl", "Cornelius", "Donnie", "Jason",
        "Dwight", "Tommy", "Casey", "Scott", "Kevin", "Earnest", "Ellsworth",
        "Lincoln", "Ernie", "Lazaro", "Mitchell", "Dante", "Brandon", "Victor",
        "Dominick", "Gerald", "Eddie", "Bradley", "Richie", "Kirby", "Leopold",
        "Octavio", "Trey", "Alden", "Herb", "Milo", "Derrick", "Moses",
        "Enrique", "Rudolph", "Nelson", "Salvatore", "Asia", "Leslie", "Lily",
        "Betty", "Vivienne", "Kylie", "Theodora", "Maddy", "Alesha", "Sarah",
        "Manuela", "Mary", "Samantha", "Isabella", "Ellie", "Charlie", "Allie",
        "Lisa", "Tessa", "Marisa", "Naomi", "Donna", "Rachel", "Carmen",
        "Selena", "Millie", "Rose", "Willow", "Gia", "Velma", "Raina",
        "Cassandra", "Fran", "Gemma", "Shauna", "Meryl", "Serena", "Keisha",
        "Brooke", "Xena", "Faith", "Molly", "Peg", "Jenny", "Tammy", "Wendy",
        "Trudy", "Luna", "Eleanor", "May", "Irena", "Iris"};

/**
 * Holds all possible names.
 */
    private static ArrayList<String> namesList =
      new ArrayList<String>(Arrays.asList(NAMES));

/**
* Randomly generates a unique name from namesList.
* @return The randomly generated name
*/
    public String nameGenerator() {
        Random random = new Random();
        int randInt = random.nextInt(namesList.size());
        String randName = namesList.get(randInt);
        namesList.remove(randInt);
        return randName;
    }

/**
 * Accessor for namesList.
 * @return The value of namesList
 */
 public static ArrayList<String> namesList() {
   return namesList;
 }
}
