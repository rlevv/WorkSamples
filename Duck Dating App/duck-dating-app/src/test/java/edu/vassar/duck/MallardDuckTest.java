package edu.vassar.duck;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class MallardDuckTest {
    MallardDuck mallard;
    
    @Before
    public void setUp() {
        mallard = new MallardDuck();
    }
    
    @Test
    public void testDisplay() {
        assertEquals("I am a " + mallard.className + ". My name is " + mallard.name + ".", mallard.display());
    }
    
    @Test 
    public void testSwim() {
        assertEquals("I am " + mallard.name + " of the " + mallard.className + " class of ducks, and I am swimming.", mallard.swim());
    }
    
    @Test 
    public void testFly() {
        assertEquals("I am " + mallard.name + " of class " + mallard.className + " and I can fly with my wings.", mallard.performFly());
    }
    
    @Test 
    public void testQuack() {
        assertEquals("Quack! Quack! Quack! says " + mallard.name + " of the " +  mallard.className + " class of ducks.", mallard.performQuack());
    }
}