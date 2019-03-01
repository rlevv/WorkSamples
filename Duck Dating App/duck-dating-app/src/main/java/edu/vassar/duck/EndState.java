package edu.vassar.duck;
import java.util.Scanner;

/**
 * Runs the part of a program that manages exiting.
 * Based off user input, either exits the program or returns to the Options
 * state.
 */
public class EndState extends State {

/**
 * Creates a new Choice state with the given session.
 * @param sess The current session
 */
    public EndState(final Session sess) {
        super(sess);
    }

/**
 * Runs the EndState section of the program.
 * Prompts the user for confirmation of exit and eitehr exits or returns
 * to the Options state accordingly.
 */
    public void run() {
      System.out.println();
      System.out.println("Data will not be saved on exit. Continue? (Y/N): ");
      reader = new Scanner(System.in);
      String choice = reader.next().toLowerCase();
      while (!(("n".equals(choice)) || ("y".equals(choice)))) {
        System.out.println("Please enter 'y' or 'n': ");
        reader = new Scanner(System.in);
        choice = reader.next().toLowerCase();
      }
      if ("y".equals(choice)) {
        System.out.println("Goodbye!");
        System.exit(0);
      } else {
          session.changeState(new Options(session));
      }
      reader.close();
    }
}

