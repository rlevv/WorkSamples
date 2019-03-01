package edu.vassar.duck;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ModelDuckTest {
    ModelDuck model;
    
    @Before
    public void setUp() {
        model = new ModelDuck();
    }
    
    @Test
    public void testDisplay() {
        assertEquals("I am a " + model.className + ". My name is " + model.name + ".", model.display());
    }
    
    @Test 
    public void testSwim() {
        assertEquals("I am " + model.name + " of the " + model.className + " class of ducks, and I am swimming.", model.swim());
    }
    
    @Test 
    public void testFly() {
        assertEquals("I am " + model.name + " of class " + model.className + " and I can fly with my wings.", model.performFly());
    }
    
    @Test 
    public void testQuack() {
        assertEquals("Quack! Quack! Quack! says " + model.name + " of the " +  model.className + " class of ducks.", model.performQuack());
    }
}