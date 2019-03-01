package edu.vassar.duck;
import java.util.ArrayList;

/**
 * Holds the data for the current session.
 * Runs the program based on the current state
 */
public class Session {

/**
 * Stores the user for the current session.
 */
    private AquaticBird user;
/**
 * Stores previous matches during this session.
 */
    private ArrayList matches = new ArrayList<AquaticBird>();
/**
 * Stores the current state.
 */
    private State state;

/**
 * Creates a new Session starting in the Intro state.
 */
    public Session() {
      state = new Intro(this);
    }

/**
 * Changes the state.
 * @param newState The new State
 */
    public void changeState(final State newState) {
      state = newState;
    }

/**
 * Adds a match to matches.
 * @param bird The new match
 */
    public void addMatch(final AquaticBird bird) {
      matches.add(bird);
    }

/**
 * Runs the current state.
 */
    public void run() {
      state.run();
    }

/**
 * Accessor for matches.
 * @return The value of matches
 */
    public ArrayList<AquaticBird> matches() {
      return matches;
    }

/**
 * Accessor for user.
 * @return The user
 */
    public AquaticBird user() {
      return user;
    }

/**
 * Sets user.
 * @param bird The new user
 */
    public void setUser(final AquaticBird bird) {
      user = bird;
    }
}
