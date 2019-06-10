package io.zipcoder.pets;

import java.util.Comparator;

public abstract class Pet implements Comparable<Pet> {

    private String name;

    public Pet(String name) {
        String formatted = formatPetName(name);
        this.name = formatted;
    }

    public Pet() {
        this.name = "";
    }

    private String formatPetName(String name) {
        String formatted = "";
        if (name != null && name.length() > 0) {
            String[] names = name.split(" ");
            for (String n : names) {
                char firstLetter = n.charAt(0);
                if (!(firstLetter >= 65 && firstLetter <= 90)) {
                    String first = String.valueOf(firstLetter).toUpperCase();
                    n = (n.length() > 1) ? first + n.substring(1) : first;
                }
                formatted = (formatted.length() > 0) ? formatted + " " + n : n;
            }
        }
        return formatted;
    }


    public int compareTo(Pet p) {
        int compared = this.name.compareTo(p.getName());
        if (compared == 0) compared = this.getType().compareTo(p.getType());
        return compared;
    }


    public abstract String speak();

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getType() {
        if (this instanceof Cat) return "Cat";
        else if (this instanceof Dog) return "Dog";
        else if (this instanceof Bird) return "Bird";
        return "Pet";
    }
}
