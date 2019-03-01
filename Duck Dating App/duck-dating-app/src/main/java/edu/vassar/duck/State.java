package edu.vassar.duck;
import java.util.Scanner;

/**
 * Parent for the different states in the program.
 */
public abstract class State {
/**
 * Stores the current session.
 */
  protected Session session;
/**
 * Stores the Scanner used to read input.
 */
  protected Scanner reader;

/**
 * Runs a new State with the given session.
 * @param sess The current session
 */
  public State(final Session sess) {
    this.session = sess;
    run();
  }

/**
 * Runs the state.
 */
  abstract void run();
}

