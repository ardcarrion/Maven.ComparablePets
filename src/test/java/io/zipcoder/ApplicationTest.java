package io.zipcoder;


import io.zipcoder.pets.Bird;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;
import org.junit.Assert;
import org.junit.Test;

public class ApplicationTest {

    @Test
    public void createPetInvalidTest(){
        Pet pet = Application.createPet("hfioewjd", "zack");

        Assert.assertNull(pet);
    }

    @Test
    public void createPetDogTest1(){
        Pet pet = Application.createPet("dog", "zack");

        Assert.assertTrue(pet instanceof Dog);
    }

    @Test
    public void createPetDogTest2(){
        Pet pet = Application.createPet("Dog", "zack");

        Assert.assertTrue(pet instanceof Dog);
    }

    @Test
    public void createPetDogTest3(){
        Pet pet = Application.createPet("DOG", "zack");

        Assert.assertTrue(pet instanceof Dog);
    }
    @Test
    public void createPetCatTest1(){
        Pet pet = Application.createPet("cat", "Rover");

        Assert.assertTrue(pet instanceof Cat);
    }

    @Test
    public void createPetCatTest2(){
        Pet pet = Application.createPet("Cat", "Rover");

        Assert.assertTrue(pet instanceof Cat);
    }

    @Test
    public void createPetCatTest3(){
        Pet pet = Application.createPet("CAT", "Rover");

        Assert.assertTrue(pet instanceof Cat);
    }


    @Test
    public void createPetBirdTest1(){
        Pet pet = Application.createPet("bird", "Cookie");

        Assert.assertTrue(pet instanceof Bird);
    }

    @Test
    public void createPetBirdTest2(){
        Pet pet = Application.createPet("Bird", "Cookie");

        Assert.assertTrue(pet instanceof Bird);
    }

    @Test
    public void createPetBirdTest3(){
        Pet pet = Application.createPet("BIRD", "Cookie");

        Assert.assertTrue(pet instanceof Bird);
    }

    @Test
    public void createPetNameTest1(){
        Pet pet = Application.createPet("Dog", "Zack");
        String expected = "Zack";
        Assert.assertEquals(expected,pet.getName());
    }

    @Test
    public void createPetNameTest2(){
        Pet pet = Application.createPet("Dog", "zack");
        String expected = "Zack";
        Assert.assertEquals(expected,pet.getName());
    }

    @Test
    public void createPetNameTest3(){
        Pet pet = Application.createPet("Dog", "white fang");
        String expected = "White Fang";
        Assert.assertEquals(expected,pet.getName());
    }

    @Test
    public void createPetNameTest4(){
        Pet pet = Application.createPet("Dog", "McDonald");
        String expected = "McDonald";
        Assert.assertEquals(expected,pet.getName());
    }



    @Test
    public void createPetStringTest() {
        String expected ="Dog Zack";
        String actual = Application.createPetString("Dog", "Zack");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petInputAsStringTest() {
        Integer numOfPet = 3;
        String[] petTypes = {"Dog", "Cat", "Bird"};
        String[] petNames = {"Copper", "Mimi", "Baker"};
        String expected = "Dog Copper\nCat Mimi\nBird Baker\n";
        String actual = Application.petInputAsString(3, petTypes, petNames);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petSaysTest() {
        String expected = "Copper says \"Roof roof!\"\n"
                + "Mimi says \"Purrr...\"\n"
                + "Baker says \"Chirp chirp!\"\n";

        Pet[] pets = {new Dog("Copper"), new Cat("Mimi"), new Bird("Baker")};

        String actual = Application.petSays(pets);

        Assert.assertEquals(expected,actual);
    }

}
