package io.zipcoder;

import io.zipcoder.pets.Bird;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

public class ComparePetsTest {

    Dog dog1 = new Dog("Copper");
    Dog dog2 = new Dog("Maya");
    Dog dog3 = new Dog("Zack");
    Cat cat1 = new Cat("Mimi");
    Cat cat2 = new Cat("Zoe");
    Cat cat3 = new Cat("Zack");
    Bird bird1 = new Bird("Baker");
    Bird bird2 = new Bird("Erik");
    Bird bird3 = new Bird("Zack");

    Pet[] pets1;
    Pet[] pets2;
    @Before
    public void setUp(){
        pets1 = new Pet[]{dog1,cat1,bird1,dog2,cat2,bird2,dog3,cat3,bird3};
        pets2 = new Pet[]{dog1,dog2,dog3,cat1,cat2,cat3,bird1,bird2,bird3};
    }

    @Test
    public void petComparableTest1(){
       Assert.assertTrue(dog1 instanceof Comparable);
    }

    @Test
    public void petComparableTest2(){
        Assert.assertTrue(cat1 instanceof Comparable);
    }

    @Test
    public void petComparableTest3(){
        Assert.assertTrue(bird1 instanceof Comparable);
    }
    @Test
    public void petComparatorTest(){
        Comparator<Pet> petComparator = new PetComparator();
        Assert.assertTrue(petComparator instanceof Comparator);
    }

    @Test
    public void SortByNameThenTypeTest1(){
        Arrays.sort(pets1);
        Pet[] expected = {bird1,dog1,bird2,dog2,cat1,bird3,cat3,dog3,cat2};
        Assert.assertArrayEquals(expected,pets1);
    }

    @Test
    public void SortByNameThenTypeTest2(){
        Arrays.sort(pets2);
        Pet[] expected = {bird1,dog1,bird2,dog2,cat1,bird3,cat3,dog3,cat2};
        Assert.assertArrayEquals(expected,pets2);
    }

    @Test
    public void SortByTypeThenNameTest1(){
        Comparator<Pet> petComparator = new PetComparator();
        Arrays.sort(pets1,petComparator);
        Pet[] expected = {bird1,bird2,bird3,cat1,cat3,cat2,dog1,dog2,dog3};
        Assert.assertArrayEquals(expected,pets1);
    }

    @Test
    public void SortByTypeThenNameTest2(){
        Comparator<Pet> petComparator = new PetComparator();
        Arrays.sort(pets2,petComparator);
        Pet[] expected = {bird1,bird2,bird3,cat1,cat3,cat2,dog1,dog2,dog3};
        Assert.assertArrayEquals(expected,pets2);
    }
}
