package _02_JavaFundamentals._22_FinalExamPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _003_PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantRarityMap = new HashMap<>();
        Map<String, Double> rateMap = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("<->");
            String plant = tokens[0];
            int rarity = Integer.parseInt(tokens[1]);

            plantRarityMap.put(plant, rarity);
            rateMap.put(plant, 0.0);
        }

        String input = scanner.nextLine();
        while (!"Exhibition".equals(input)) {
            String[] tokens = input.split("[: -]+");
            String command = tokens[0];
            String plant = tokens[1];

            boolean isValidCommand = command.equals("Rate") || command.equals("Update") || command.equals("Reset");

            if (!plantRarityMap.containsKey(plant) || !isValidCommand) {
                System.out.print("error");
            } else {
                switch (command) {
                    case "Rate":
                        double rate = Double.parseDouble(tokens[2]);
                        if (rateMap.get(plant) == 0) {
                            rateMap.put(plant, rate);
                        } else {
                            double newRate = (rateMap.get(plant) + rate) / 2;
                            rateMap.put(plant,newRate);
                        }
                        break;
                    case "Update":
                        int newRarity = Integer.parseInt(tokens[2]);

                        plantRarityMap.put(plant,newRarity);
                        break;
                    case "Reset":
                        rateMap.put(plant,0.0);
                        break;
                }
            }

            input = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        for (Map.Entry<String, Integer> entry : plantRarityMap.entrySet()) {
            System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",entry.getKey(),entry.getValue(),rateMap.get(entry.getKey()));

        }


    }
}
