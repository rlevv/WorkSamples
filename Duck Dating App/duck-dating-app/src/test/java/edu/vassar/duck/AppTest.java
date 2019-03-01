package edu.vassar.duck;

import org.junit.Test;
import static org.junit.Assert.*;

// CLass to test all the functions for the each of the types of ducks. It does
// so for multiple versions of each kind of duck to test the functions work with
// the different cosntructor options.
public class AppTest {
        /*//Create 4 different MallardDucks to test possible constructor options
        static MallardDuck mallard1 = new MallardDuck();
        static MallardDuck mallard2 = new MallardDuck();
        static MallardDuck mallard3 = new MallardDuck("Mr. Mallard");
        static MallardDuck mallard4 = new MallardDuck("Mr. Mallard");
        
        //Create 4 different DecoyDucks to test possible constructor options
        static DecoyDuck decoy1 = new DecoyDuck();
        static DecoyDuck decoy2 = new DecoyDuck();
        static DecoyDuck decoy3 = new DecoyDuck("Mr. Decoy");
        static DecoyDuck decoy4 = new DecoyDuck("Mr. Decoy");
        
        //Create 4 different ModelDucks to test possible constructor options
        static ModelDuck model1 = new ModelDuck();
        static ModelDuck model2 = new ModelDuck();
        static ModelDuck model3 = new ModelDuck("Mr. Model");
        static ModelDuck model4 = new ModelDuck("Mr. Model");
        
        //Create 4 different RedheadDucks to test possible contructor options
        static RedheadDuck redhead1 = new RedheadDuck();
        static RedheadDuck redhead2 = new RedheadDuck();
        static RedheadDuck redhead3 = new RedheadDuck("Mr. Redhead");
        static RedheadDuck redhead4 = new RedheadDuck("Mr. Redhead");
        
        //Create 4 different RubberDucks to test possible contructor options
        static RubberDuck rubber1 = new RubberDuck();
        static RubberDuck rubber2 = new RubberDuck();
        static RubberDuck rubber3 = new RubberDuck("Mr. Rubber");
        static RubberDuck rubber4 = new RubberDuck("Mr. Rubber");
    
    //tests the swim method of the MallardDuck class for different constructors
    @Test
    public void testSwimMallard1() {       
        assertEquals("I am Mallard0 of the MallardDuck class of ducks, and I am "
                + "swimming.", mallard1.swim());
    }
    
    @Test
    public void testSwimMallard2() {
        assertEquals("I am Mallard1 of the MallardDuck class of ducks, and "
                + "I am swimming.", mallard2.swim());
    }
    
    @Test
    public void testSwimMallard3() {
        assertEquals("I am Mr. Mallard of the MallardDuck class of ducks, and "
                + "I am swimming.", mallard3.swim());
    }
    
    @Test
    public void testSwimMallard4() {
        assertEquals("I am Mr. Mallard2 of the MallardDuck class of ducks, and "
                + "I am swimming.", mallard4.swim());
    }
    
    //tests the swim method of the DecoyDuck class for different constructors
    @Test
    public void testSwimDecoy1() {       
        assertEquals("I am Decoy3 of the DecoyDuck class of ducks, and "
                + "I am swimming.", decoy1.swim());
    }
    
    @Test
    public void testSwimDecoy2() {
        assertEquals("I am Decoy4 of the DecoyDuck class of ducks, and "
                + "I am swimming.", decoy2.swim());
    }
    
    @Test
    public void testSwimDecoy3() {
        assertEquals("I am Mr. Decoy of the DecoyDuck class of ducks, and "
                + "I am swimming.", decoy3.swim());
    }
    
    @Test
    public void testSwimDecoy4() {
        assertEquals("I am Mr. Decoy5 of the DecoyDuck class of ducks, and "
                + "I am swimming.", decoy4.swim());
    }
    
    //tests the swim method of the ModelDuck class for different constructors
    @Test
    public void testSwimModel1() {
        assertEquals("I am Model6 of the ModelDuck class of ducks, and "
                + "I am swimming.", model1.swim());
    }
    
    @Test
    public void testSwimModel2() {
        assertEquals("I am Model7 of the ModelDuck class of ducks, and "
                + "I am swimming.", model2.swim());
    }
    
    @Test
    public void testSwimModel3() {
        assertEquals("I am Mr. Model of the ModelDuck class of ducks, and "
                + "I am swimming.", model3.swim());
    }
    
    @Test
    public void testSwimModel4() {
        assertEquals("I am Mr. Model8 of the ModelDuck class of ducks, and "
                + "I am swimming.", model4.swim());
    }
    
    //tests the swim method of the RedheadDuck class for different constructors
    @Test
    public void testSwimRedhead1() {
        assertEquals("I am Redhead9 of the RedheadDuck class of ducks, and "
                + "I am swimming.", redhead1.swim());
    }
    
    @Test
    public void testSwimRedhead2() {
        assertEquals("I am Redhead10 of the RedheadDuck class of ducks, and "
                + "I am swimming.", redhead2.swim());
    }
    
    @Test
    public void testSwimRedhead3() {
        assertEquals("I am Mr. Redhead of the RedheadDuck class of ducks, and "
                + "I am swimming.", redhead3.swim());
    }
    
    @Test
    public void testSwimRedhead4() {
        assertEquals("I am Mr. Redhead11 of the RedheadDuck class of ducks, and"
                + " I am swimming.", redhead4.swim());
    }
    
    //tests the swim method of the RubberDuck class for different constructors
    @Test
    public void testSwimRubber1() {
        assertEquals("I am Rubber12 of the RubberDuck class of ducks, and "
                + "I am swimming.", rubber1.swim());
    }
    
    @Test
    public void testSwimRubber2() {
        assertEquals("I am Rubber13 of the RubberDuck class of ducks, and "
                + "I am swimming.", rubber2.swim());
    }
    
    @Test
    public void testSwimRubber3() {
        assertEquals("I am Mr. Rubber of the RubberDuck class of ducks, and "
                + "I am swimming.", rubber3.swim());
    }
    
    @Test
    public void testSwimRubber4() {
        assertEquals("I am Mr. Rubber14 of the RubberDuck class of ducks, and "
                + "I am swimming.", rubber4.swim());
    }
    
    //tests the quack method of the MallardDuck class for different constructors
    @Test
    public void testQuackMallard1() {
        assertEquals("Quack! Quack! Quack! says Mallard0 of the MallardDuck "
                + "class of ducks", mallard1.performQuack());
    }
    
    @Test
    public void testQuackMallard2() {
        assertEquals("Quack! Quack! Quack! says Mallard1 of the MallardDuck "
                + "class of ducks", mallard2.performQuack());
    }
    
    @Test
    public void testQuackMallard3() {
        assertEquals("Quack! Quack! Quack! says Mr. Mallard of the MallardDuck "
                + "class of ducks", mallard3.performQuack());
    }
    
    @Test
    public void testQuackMallard4() {
        assertEquals("Quack! Quack! Quack! says Mr. Mallard2 of the MallardDuck "
                + "class of ducks", mallard4.performQuack());
    }
    
    //tests the quack method of the ModelDuck class for different constructors
    @Test
    public void testQuackModel1() {
        assertEquals("Quack! Quack! Quack! says Model6 of the ModelDuck "
                + "class of ducks", model1.performQuack());
    }
    
    @Test
    public void testQuackModel2() {
        assertEquals("Quack! Quack! Quack! says Model7 of the ModelDuck "
                + "class of ducks", model2.performQuack());
    }
    
    @Test
    public void testQuackModel3() {
        assertEquals("Quack! Quack! Quack! says Mr. Model of the ModelDuck "
                + "class of ducks", model3.performQuack());
    }
    
    @Test
    public void testQuackModel4() {
        assertEquals("Quack! Quack! Quack! says Mr. Model8 of the ModelDuck "
                + "class of ducks", model4.performQuack());
    }
    
    //tests the quack method of the RedheadDuck class for different constructors
    @Test
    public void testQuackRedhead1() {
        assertEquals("Quack! Quack! Quack! says Redhead9 of the RedheadDuck "
                + "class of ducks", redhead1.performQuack());
    }
    
    @Test
    public void testQuackRedhead2() {
        assertEquals("Quack! Quack! Quack! says Redhead10 of the RedheadDuck "
                + "class of ducks", redhead2.performQuack());
    }
    
    @Test
    public void testQuackRedhead3() {
        assertEquals("Quack! Quack! Quack! says Mr. Redhead of the RedheadDuck "
                + "class of ducks", redhead3.performQuack());
    }
    
    @Test
    public void testQuackRedhead4() {
        assertEquals("Quack! Quack! Quack! says Mr. Redhead11 of the "
                + "RedheadDuck class of ducks", redhead4.performQuack());
    }
    
    //tests the quack method of the RubberDuck class for different constructors
    @Test
    public void testQuackRubber1() {
        assertEquals("Quack! Quack! Quack! says Rubber12 of the RubberDuck "
                + "class of ducks", rubber1.performQuack());
    }
    
    @Test
    public void testQuackRubber2() {
        assertEquals("Quack! Quack! Quack! says Rubber13 of the RubberDuck "
                + "class of ducks", rubber2.performQuack());
    }
    
    @Test
    public void testQuackRubber3() {
        assertEquals("Quack! Quack! Quack! says Mr. Rubber of the RubberDuck "
                + "class of ducks", rubber3.performQuack());
    }
    
    @Test
    public void testQuackRubber4() {
        assertEquals("Quack! Quack! Quack! says Mr. Rubber14 of the RubberDuck "
                + "class of ducks", rubber4.performQuack());
    }
    
    //tests the fly method of the MallardDuck class for different constructors
    @Test
    public void testFlyMallard1() {
        assertEquals("I am Mallard0 of class MallardDuck and "
                + "I can fly with my wings", mallard1.performFly());
    }
    
    @Test
    public void testFlyMallard2() {
        assertEquals("I am Mallard1 of class MallardDuck and "
                + "I can fly with my wings", mallard2.performFly());
    }
    
    @Test
    public void testFlyMallard3() {
        assertEquals("I am Mr. Mallard of class MallardDuck and "
                + "I can fly with my wings", mallard3.performFly());
    }
    
    @Test
    public void testFlyMallard4() {
        assertEquals("I am Mr. Mallard2 of class MallardDuck and "
                + "I can fly with my wings", mallard4.performFly());
    }
    
    //tests the fly method of the RedheadDuck class for different constructors
    @Test
    public void testFlyRedhead1() {
        assertEquals("I am Redhead9 of class RedheadDuck and "
                + "I can fly with my wings", redhead1.performFly());
    }
    
    @Test
    public void testFlyRedhead2() {
        assertEquals("I am Redhead10 of class RedheadDuck and "
                + "I can fly with my wings", redhead2.performFly());
    }
    
    @Test
    public void testFlyRedhead3() {
        assertEquals("I am Mr. Redhead of class RedheadDuck and "
                + "I can fly with my wings", redhead3.performFly());
    }
    
    @Test
    public void testFlyRedhead4() {
        assertEquals("I am Mr. Redhead11 of class RedheadDuck and "
                + "I can fly with my wings", redhead4.performFly());
    }
    
    //tests the fly/setFlyMode methods of the RedheadDuck class for 
    //different constructors
    @Test
    public void testFlyDefaultModel1() {
        assertEquals("I am Model6 of class ModelDuck and I can fly "
                + "with my wings", model1.performFly());
    }
    
    @Test
    public void testFlyRocketModel1() {
        model1.setFlyMode("rocket");
        
        assertEquals("I am Model6 of class ModelDuck and I can fly "
                + "like a rocket", model1.performFly());
    }
    
    //Switch to wings to check if it works in a non-default mode
    @Test
    public void testFlyWingModel1() {
        model1.setFlyMode("wings");
        
        assertEquals("I am Model6 of class ModelDuck and I can fly "
                + "with my wings", model1.performFly());
    }
    
    @Test
    public void testFlyDefaultModel2() {
        assertEquals("I am Model7 of class ModelDuck and I can fly "
                + "with my wings", model2.performFly());
    }
    
    @Test
    public void testFlyRocketModel2() {
        model2.setFlyMode("rocket");
        
        assertEquals("I am Model7 of class ModelDuck and I can fly "
                + "like a rocket", model2.performFly());
    }
    
    //Switch to wings to check if it works in a non-default mode
    @Test
    public void testFlyWingModel2() {
        model2.setFlyMode("wings");
        
        assertEquals("I am Model7 of class ModelDuck and I can fly "
                + "with my wings", model2.performFly());
    }
    
    //tests the fly/setFlyMode methods of the RedheadDuck class for 
    //different constructors
    @Test
    public void testFlyDefaultModel3() {
        assertEquals("I am Mr. Model of class ModelDuck and I can fly "
                + "with my wings", model3.performFly());
    }
    
    @Test
    public void testFlyRocketModel3() {
        model3.setFlyMode("rocket");
        
        assertEquals("I am Mr. Model of class ModelDuck and I can fly "
                + "like a rocket", model3.performFly());
    }
    
    //Switch to wings to check if it works in a non-default mode
    @Test
    public void testFlyWingModel3() {
        model3.setFlyMode("wings");
        
        assertEquals("I am Mr. Model of class ModelDuck and I can fly "
                + "with my wings", model3.performFly());
    }
    
    //tests the fly/setFlyMode methods of the RedheadDuck class for 
    //different constructors
    @Test
    public void testFlyDefaultModel4() {
        assertEquals("I am Mr. Model8 of class ModelDuck and I can fly "
                + "with my wings", model4.performFly());
    }
    
    @Test
    public void testFlyRocketModel4() {
        model4.setFlyMode("rocket");
        
        assertEquals("I am Mr. Model8 of class ModelDuck and I can fly "
                + "like a rocket", model4.performFly());
    }
    
    //Switch to wings to check if it works in a non-default mode
    @Test
    public void testFlyWingModel4() {
        model4.setFlyMode("wings");
        
        assertEquals("I am Mr. Model8 of class ModelDuck and I can fly "
                + "with my wings", model4.performFly());
    }
*/
}
