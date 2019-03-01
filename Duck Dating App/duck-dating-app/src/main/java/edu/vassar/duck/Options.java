package edu.vassar.duck;
import java.util.Scanner;

/**
 * Runs the part of a program that manages options.
 * Lets the user choose which state to move to next
 */
public class Options extends State {

/**
 * Creates a new Choice state with the given session.
 * @param sess The current session
 */
    public Options(final Session sess) {
        super(sess);
    }

/**
 * Runs the Options section of the program.
 * Lets the user decude whether to see another potential match, see their
 * previous matches, or exit the program. Sets the state accordingly.
 */
    public void run() {
      System.out.println("What would you like to do next? ");
      System.out.println("(1) See next match");
      System.out.println("(2) See previous matches");
      System.out.println("(3) Exit");
      reader = new Scanner(System.in);
      int selection = reader.nextInt();

      while (selection > 3 || selection < 1) {
        System.out.println("Please enter '1', '2', or '3': ");
        reader = new Scanner(System.in);
        selection = reader.nextInt();
      }
      switch (selection) {
        case 1: session.changeState(new Choice(session)); break;
        case 2: session.changeState(new History(session)); break;
        case 3: session.changeState(new EndState(session)); break;
        default: session.changeState(new Options(session));
      }
      reader.close();
    }
}

