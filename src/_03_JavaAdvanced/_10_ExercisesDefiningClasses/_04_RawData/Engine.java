package _03_JavaAdvanced._10_ExercisesDefiningClasses._04_RawData;

public class Engine {

    private  int speed;
    private  int power;

    public Engine(int speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPower() {
        return power;
    }
}
