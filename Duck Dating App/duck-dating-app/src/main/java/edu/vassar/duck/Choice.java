package edu.vassar.duck;
import java.util.Random;
import java.util.Scanner;

/**
 * Runs the part of a program that manages new matches.
 * Shows the user a potential match for their duck with another duck, and
 * allows the user to decide if they want to match with that duck. Assuming
 * they do, returns whether that attempt to match was succesful and adds
 * that duck to the list of matches for your duck.
 */
public class Choice extends State {

/**
 * Stores the potential match.
 */
  private AquaticBird match;
/**
 * Stores the compatibility score for the user and potential match.
 */
  private Compatibility comp;

/**
 * Creates a new Choice state with the given session.
 * @param sess The current session
 */
  public Choice(final Session sess) {
    super(sess);
  }

/**
 * Runs the Choice section of the program.
 * Creates the duck to be checked for compatibility, checks compatibility, and
 * asks the user if they want to try to match with that; returning a proper
 * statement depending on the choice.
 */
  public void run() {
    // creates the duck to be checked randomly
    Random rand = new Random();
    int type = rand.nextInt(5);
    switch (type) {
      case 0: match = new MallardDuck();
        break;
      case 1: match = new RedheadDuck();
        break;
      case 2: match = new RubberDuck();
        break;
      case 3: match = new ModelDuck();
        break;
      case 4: match = new DecoyDuck();
        break;
      default: match = new DecoyDuck();
    }
    // creates the compatibility between the ducks
    comp = new Compatibility(match, session.user());

    // creates the output with the basic compatibility information
    // and compared ducks infromation
    System.out.println();
    System.out.println("Potential Match: " + match.name() + "\n");
    System.out.println(match.name() + " is a " + match.size() + 
                        " foot long " + match.className() + ".\n");
    System.out.println(comp);
    System.out.println("Match with "+ match.name() +"? (Y/N)");

    // checks input from user
    reader = new Scanner(System.in);
    String choice = reader.next().toLowerCase();
    while (!(("n".equals(choice)) || ("y".equals(choice)))) {
      System.out.println("Please enter 'y' or 'n': ");
      reader = new Scanner(System.in);
      choice = reader.next().toLowerCase();
    }
    // returns correct output based on input
    System.out.println();
    if ("y".equals(choice)) {
      System.out.println("Swiped right on " + match.name() + "!");
      displayResult();
    } else {
        System.out.println("Swiped left on " + match.name() + "!");
        System.out.println("It wasn't meant to be.\n");
    }
    // goes back to the options state/class
    session.changeState(new Options(session));
    reader.close();
  }

/**
 * Prints out whether there was a match with the other duck or not.
 */
  private void displayResult() {
    Random rand = new Random();
    double percent = comp.score();
    double choice = rand.nextDouble() * 100 + 1;
    if (choice >= percent) {
      System.out.println("No match, sorry.\n");
    } else {
        System.out.println("It's a match!\n");
        session.addMatch(match);
    }
  }
}
