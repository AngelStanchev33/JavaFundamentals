package _03_JavaAdvanced._04_ExercisesMultidimensionalArrayss;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06_StringMatrixRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rotation = Integer.parseInt(scanner.nextLine().trim().split("\\(")[1].replaceAll("\\)", ""));

        int rotationAngle = rotation % 360;

        List<String> words = new ArrayList<>();
        int maxLength = Integer.MIN_VALUE;

        String input = scanner.nextLine().trim();
        while (!"END".equals(input)) {
            words.add(input);
            if (input.length() > maxLength) {
                maxLength = input.length();
            }
            input = scanner.nextLine();
        }

        int rows = words.size();
        int cols = maxLength;

        char[][] matrix = new char[rows][cols];

        fillMatrix(matrix, words);

        switch (rotationAngle) {
            case 90:
                matrix = rotate90(matrix, rows, cols);
                break;
            case 180:
                matrix = rotate90(matrix, rows, cols);
                matrix = rotate90(matrix, rows, cols);
                break;
            case 270:
                matrix = rotate90(matrix, rows, cols);
                matrix = rotate90(matrix, rows, cols);
                matrix = rotate90(matrix, rows, cols);
                break;
        }
        printMatrix(matrix);

    }
    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static char[][] rotate90(char[][] matrix, int rows, int cols) {
        char[][] rotatedMatrix = new char[cols][rows];//кара матрицата да се пълни от горе надолу а не от ляво на дясно

        for (int col = 0; col < cols; col++) {
            int colCounter = 0;
            for (int row = rows - 1; row >= 0; row--) {
                rotatedMatrix[col][colCounter++] = matrix[row][col];

            }

        }
        return rotatedMatrix;
    }

    private static void fillMatrix(char[][] matrix, List<String> words) {
        for (int row = 0; row < matrix.length; row++) {
            String currentWord = words.get(row);
            for (int col = 0; col < matrix[row].length; col++) {
                if (col < currentWord.length()) {
                    matrix[row][col] = currentWord.charAt(col);
                } else {
                    matrix[row][col] = ' ';
                }
            }
        }
    }
}
