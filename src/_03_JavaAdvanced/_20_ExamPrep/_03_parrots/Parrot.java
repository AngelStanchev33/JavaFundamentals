package _03_JavaAdvanced._20_ExamPrep._03_parrots;

public class Parrot {

    private String name;
    private String species;
    private boolean available;

    public Parrot(String name, String species) {
        this.name = name;
        this.species = species;
        available = true;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public boolean isAvailable(){
        return  available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    public String toString() {
        return String.format("Parrot (%s): %s", species, name);
    }
}


