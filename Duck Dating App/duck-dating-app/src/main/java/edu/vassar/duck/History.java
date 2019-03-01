package edu.vassar.duck;
import java.util.ArrayList;

/**
 * Runs the part of a program that manages history.
 * Prints the previous successful matches of the user's duck with other ducks
 */
public class History extends State {

/**
 * Creates a new History state with the given session.
 * @param sess The current session
 */
    public History(final Session sess) {
        super(sess);
    }

/**
 * Runs the History section of the program.
 * Creates the duck to be checked for compatibility, checks compatibility, and
 * asks the user if they want to try to match with that; returning a proper
 * statement depending on the choice.
 */
    public void run() {
      ArrayList<AquaticBird> matches = session.matches();
      System.out.println();
      System.out.println("Previous Matches:");
      for (int i = 0; i < matches.size(); i++) {
        System.out.println(matches.get(i).name);
      }
      System.out.println();
      session.changeState(new Options(session));
    }
}

