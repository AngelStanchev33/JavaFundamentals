package _03_JavaAdvanced._10_ExercisesDefiningClasses._07_Google;

public class Pokemon  {

    private String pokemonName;
    private String pokemonType;

    public Pokemon(String pokemonName, String pokemonType) {
        this.pokemonName = pokemonName;
        this.pokemonType = pokemonType;
    }

    @Override
    public String toString() {
        return String.format("%s %s",pokemonName,pokemonType);
    }
}
