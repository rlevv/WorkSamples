package edu.vassar.duck;
import java.util.Scanner;

/**
 * Runs the part of a program that initializes the user's duck.
 * The user creates a duck to be compared with randomly generated ducks for
 * compatibility
 */
public class Intro extends State {
/**
 * Creates a new Intro state with the given session.
 * @param sess The current session
 */
    public Intro(final Session sess) {
        super(sess);
    }


/**
 * Runs the Intro section of the program.
 * Creates the user's bird by taking in a name and duck type as user input and
 * randomly generating other chracteristics.
 */
    public void run() {
        // holds the users bird
        AquaticBird user = null;
        // creates bird name
        System.out.println("Please enter your name: ");
        reader = new Scanner(System.in);
        String name = reader.next();
        String type = "a";
        // picks duck type
        String typeLetters = "dmoru";
        while (!typeLetters.contains(type)) {
          System.out.println("Please indicate your species. (D)ecoyDuck, "
            + "(M)allardDuck, M(O)delDuck, (R)edheadDuck, or R(U)bberDuck: ");
          reader = new Scanner(System.in);
          type = reader.next().toLowerCase();
          if ("d".equals(type)) {
            user = new DecoyDuck(name);
          } else if ("m".equals(type)) {
              user = new MallardDuck(name);
          } else if ("o".equals(type)) {
              user = new ModelDuck(name);
          } else if ("r".equals(type)) {
              user = new RedheadDuck(name);
          } else if ("u".equals(type)) {
              user = new RubberDuck(name);
          } else {
              System.out.println("Invalid input.");
          }
        }
        // makes the users duck the program user and goes to the options menue
        session.setUser(user);
        session.changeState(new Options(session));
        reader.close();
    }
}
