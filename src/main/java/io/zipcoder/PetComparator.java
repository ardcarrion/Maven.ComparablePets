package io.zipcoder;

import io.zipcoder.pets.Pet;

import java.util.Comparator;

public class PetComparator implements Comparator<Pet> {
    public int compare(Pet pet1, Pet pet2) {
        int compared = pet1.getType().compareTo(pet2.getType());
        if (compared == 0) {
            compared = pet1.getName().compareTo(pet2.getName());
        }
        return compared;
    }
}
