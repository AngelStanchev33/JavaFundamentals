package _03_JavaAdvanced._10_ExercisesDefiningClasses._04_RawData;

public class Cargo {
    private int weight;
    private  String type;

    public Cargo(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public int getWeight() {
        return weight;
    }

    public String getType() {
        return type;
    }
}
