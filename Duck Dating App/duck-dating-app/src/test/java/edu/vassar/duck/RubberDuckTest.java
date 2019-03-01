package edu.vassar.duck;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RubberDuckTest {
    RubberDuck rubberduck;
    
    @Before
    public void setUp() {
        rubberduck = new RubberDuck();
    }
    
    @Test
    public void testDisplay() {
        assertEquals("I am a " + rubberduck.className + ". My name is " + rubberduck.name + ".", rubberduck.display());
    }
    
    @Test 
    public void testSwim() {
        assertEquals("I am " + rubberduck.name + " of the " + rubberduck.className + " class of ducks, and I am swimming.", rubberduck.swim());
    }
    
    @Test 
    public void testFly() {
        assertEquals("I am " + rubberduck.name + " of class " + rubberduck.className + " and I can't fly.", rubberduck.performFly());
    }
    
    @Test 
    public void testQuack() {
        assertEquals("Squeak! Squeak! says " + rubberduck.name + " of the " +  rubberduck.className + " class of ducks.", rubberduck.performQuack());
    }
}