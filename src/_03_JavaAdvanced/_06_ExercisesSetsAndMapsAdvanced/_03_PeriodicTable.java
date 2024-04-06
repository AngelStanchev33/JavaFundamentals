package _03_JavaAdvanced._06_ExercisesSetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class _03_PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

        Set<String> elements = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().trim().split("\\s+");
            elements.addAll(Arrays.asList(tokens));
        }
        for (String element : elements) {
            System.out.print(element + " ");
        }
    }

}
