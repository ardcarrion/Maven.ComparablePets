package io.zipcoder.pets;

public abstract class Pet {

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


    public abstract String speak();

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
