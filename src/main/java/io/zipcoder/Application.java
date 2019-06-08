package io.zipcoder;


import io.zipcoder.pets.Bird;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;

public class Application {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        String numberInput = Console.getStringInput("How many pets do you have?");
        Integer numberOfPets = Integer.valueOf(numberInput);
        String[] petNames = new String[numberOfPets];
        String[] petTypes = new String[numberOfPets];
        Pet[] pets = new Pet[numberOfPets];
        for (Integer i = 0;i < numberOfPets; i++) {
            String prompt = String.format("What's the name of pet number %d?", i+1);
            petNames[i] = Console.getStringInput(prompt);
            prompt = String.format("What kind of pet is pet number %d?", i+1);
            petTypes[i] = Console.getStringInput(prompt);
            pets[i] = createPet(petTypes[i], petNames[i]);
        }
        Console.println("So your pets are:");
        System.out.println(petInputAsString(numberOfPets, petTypes, petNames));
        System.out.println(petSays(pets));
    }

    public static Pet createPet(String type, String name) {
        if (type.equalsIgnoreCase("cat")) {
            Cat cat = new Cat(name);
            return cat;
        } else if (type.equalsIgnoreCase("dog")) {
            Dog dog = new Dog(name);
            return dog;
        } else if (type.equalsIgnoreCase("bird")) {
            Bird bird = new Bird(name);
            return bird;
        }
        return null;
    }

    public static String createPetString(String type, String name) {
        Pet p = createPet(type, name);
        String formattedName = p.getName();
        return String.format("%s %s", type, formattedName);
    }

    public static String petInputAsString(Integer numberOfPets, String[] petTypes, String[] petNames) {
        StringBuilder output = new StringBuilder(numberOfPets);
        for (int i = 0; i < numberOfPets; i++) {
            output.append(createPetString(petTypes[i], petNames[i]) + "\n");
        }
        return output.toString();
    }

    public static String petSays(Pet[] pets) {
        StringBuilder output = new StringBuilder(pets.length);
        for (Pet p : pets) output.append(String.format("%s says \"%s\"\n", p.getName(), p.speak()));
        return output.toString();
    }

}
