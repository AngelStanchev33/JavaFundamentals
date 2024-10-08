package _02_JavaFundamentals._08_ObjectsAndClasses;

import java.util.Random;
import java.util.Scanner;

public class _01_RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Random rand = new Random();
        for (int i = 0; i < words.length ; i++) {
            int randomIndex = rand.nextInt(words.length);

            rand.nextInt(words.length);

            String temp = words[i];
            words[i] = words[randomIndex];
            words[randomIndex] = temp;
        }

        for (String word : words) {
            System.out.println(word);
        }
    }
}
