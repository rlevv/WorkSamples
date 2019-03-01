package edu.vassar.duck;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class DecoyDuckTest {
    DecoyDuck decoy;
    
    @Before
    public void setUp() {
        decoy = new DecoyDuck();
    }
    
    @Test
    public void testDisplay() {
        assertEquals("I am a " + decoy.className + ". My name is " + decoy.name + ".", decoy.display());
    }
    
    @Test 
    public void testSwim() {
        assertEquals("I am " + decoy.name + " of the " + decoy.className + " class of ducks, and I am swimming.", decoy.swim());
    }
    
    @Test 
    public void testFly() {
        assertEquals("I am " + decoy.name + " of class " + decoy.className + " and I can't fly.", decoy.performFly());
    }
    
    @Test 
    public void testQuack() {
        assertEquals("I can't quack says " + decoy.name + " of the " + decoy.className + " class of ducks.", decoy.performQuack());
    }
}
