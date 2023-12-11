package lr4;

import java.util.Arrays;
import java.util.Random;

public class Example7 {

    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;

        int[][] matrix = new int[rows][cols];

        // Заполняем двумерный массив змейкой
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = i * cols + j + 1;
            }
        }

        System.out.println("Массив заполнен змейкой:");
        displayMatrix(matrix);
    }

    private static void displayMatrix(int[][] matrix) {
        StringBuilder sb = new StringBuilder();
        sb.append("");

        for (int[] row : matrix) {
            sb.append(Arrays.toString(row));
            sb.append('\n');
        }

        System.out.println(sb.toString());
    }
}
