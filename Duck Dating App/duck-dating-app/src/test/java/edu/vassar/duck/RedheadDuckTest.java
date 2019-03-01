package edu.vassar.duck;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RedheadDuckTest {
    RedheadDuck redhead;
    
    @Before
    public void setUp() {
        redhead = new RedheadDuck();
    }
    
    @Test
    public void testDisplay() {
        assertEquals("I am a " + redhead.className + ". My name is " + redhead.name + ".", redhead.display());
    }
    
    @Test 
    public void testSwim() {
        assertEquals("I am " + redhead.name + " of the " + redhead.className + " class of ducks, and I am swimming.", redhead.swim());
    }
    
    @Test 
    public void testFly() {
        assertEquals("I am " + redhead.name + " of class " + redhead.className + " and I can fly with my wings.", redhead.performFly());
    }
    
    @Test 
    public void testQuack() {
        assertEquals("Quack! Quack! Quack! says " + redhead.name + " of the " +  redhead.className + " class of ducks.", redhead.performQuack());
    }
}