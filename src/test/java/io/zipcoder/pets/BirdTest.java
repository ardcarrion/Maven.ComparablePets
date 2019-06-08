package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Joanna Hsiao on 6/7/19.
 */

public class BirdTest {

    @Test
    public void constructorTest(){
        String expected = "Beaker";
        Bird bird = new Bird(expected);

        String actual = bird.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void setNameTest() {
        String expected = "Beaker";
        Bird bird = new Bird("Waltz");

        bird.setName(expected);
        String actual = bird.getName();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void speakTest() {
        String expected = "Chirp chirp!";
        Bird bird = new Bird("Beaker");

        String actual = bird.speak();
        Assert.assertEquals(expected,actual);
    }
}
