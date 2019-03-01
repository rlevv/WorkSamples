package edu.vassar.duck;

/**
 * Generates a unique serial number.
 */
public class UniqueSerialGen {
/**
 * Stores individual ascii integers to be converted to a serial number.
 */
    private static int[] serialParts = {48, 48, 48, 48, 48};

/**
 * Creates a unique serial number for each duck.
 * Converts ascii integers into characters and concatenates them into a single
 * string.
 * @return A unique serial number
 */
    public String uniqueGenerator() {
        //Goes through and checks if there is a character not equal to the first
        //character and sets the first such character found to be equal to the
        //first value, thereby creating a unique serial number
        for (int i = 1; i < serialParts.length; i++) {
            if (serialParts[0] != serialParts[i]) {
                serialParts[i] = serialParts[0];
                //Returns a string version of the 5 characters
                return "" + (char) serialParts[4] + (char) serialParts[3]
                        + (char) serialParts[2] + (char) serialParts[1]
                        + (char) serialParts[0];
            }
        }

        //If all characters are the same, changes the first character to a new
        //value
        if (serialParts[0] < 57) {
            serialParts[0]++;
        } else if (serialParts[0] == 57) {
            serialParts[0] = 65;
        } else {
            serialParts[0]++;
        }

        //Returns a string version of the 5 characters
        return "" + (char) serialParts[4] + (char) serialParts[3]
                + (char) serialParts[2] + (char) serialParts[1]
                + (char) serialParts[0];
    }
}
