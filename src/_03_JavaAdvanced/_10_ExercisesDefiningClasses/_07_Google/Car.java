package _03_JavaAdvanced._10_ExercisesDefiningClasses._07_Google;

public class Car {

     private String carModel;
    private String carSpeed;

    public Car(String carModel, String carSpeed) {
        this.carModel = carModel;
        this.carSpeed = carSpeed;
    }

    @Override
    public String toString() {
        return String.format("%s %s",carModel,carSpeed);
    }
}
