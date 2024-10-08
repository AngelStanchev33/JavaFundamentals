package _04_JavaOOP._02_Encapsulation._04_PizzaCalories;

import java.util.Map;

public class Dough {

    private String flourType;
    private String bakingTechnique;
    private double weight;

    private Map<String,Double> doughModifiers = Map.of("White",1.5,
                                                       "Wholegrain",1.0,
                                                       "Crispy",0.9,
                                                       "Chewy",1.1,
                                                       "Homemade",1.0);
    public Dough(String flourType, String bakingTechnique, double weight) {
        this.setFlourType(flourType);
        this.setBakingTechnique(bakingTechnique);
        this.setWeight(weight);
    }

    private void setFlourType(String flourType) {
        if (!doughModifiers.containsKey(flourType)){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) {
        if (!doughModifiers.containsKey(bakingTechnique)){
            throw new IllegalArgumentException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) {
        if (weight<0 || weight >200){
            throw new IllegalArgumentException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories(){
        return 2 * weight * doughModifiers.get(this.flourType) * doughModifiers.get(this.bakingTechnique);
    }
}
