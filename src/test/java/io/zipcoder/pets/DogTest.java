package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Joanna Hsiao on 6/7/19.
 */

public class DogTest {

    @Test
    public void constructorTest(){
        String expected = "Maya";
        Dog dog = new Dog(expected);

        String actual = dog.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNameTest() {
        String expected = "Maya";
        Dog dog = new Dog("Lily");

        dog.setName(expected);
        String actual = dog.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest() {
        String expected = "Roof roof!";
        Dog dog = new Dog("Maya");

        String actual = dog.speak();
        Assert.assertEquals(expected,actual);
    }
}
