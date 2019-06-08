package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Joanna Hsiao on 6/7/19.
 */


public class PetTest {

    @Test
    public void testCatInheritance()
    {
        Cat cat = new Cat("Coco");
        Assert.assertTrue(cat instanceof Pet);
    }

    @Test
    public void testDogInheritance()
    {
        Dog dog = new Dog("Copper");
        Assert.assertTrue(dog instanceof Pet);
    }

    @Test
    public void testBirdInheritance()
    {
        Bird bird = new Bird("Alex");
        Assert.assertTrue(bird instanceof Pet);
    }



}
