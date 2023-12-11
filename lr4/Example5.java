package lr4;

import java.util.Arrays;
import java.util.Random;

public class Example5 {
    public static void main(String[] args) {

    int rows = 3;
    int columns = 5;

    int[][] array = new int[rows][columns];

    // Заполняем массив случайными числами
    Random random = new Random();
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            array[i][j] = random.nextInt(100);
        }
    }

    // Выводим исходный массив
        System.out.println("Исходный массив:");
        for (int[] row : array) {
        System.out.println(Arrays.toString(row));
    }

    // Создаем новый массив с поменяными строками и столбцами
    int[][] transposedArray = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
            transposedArray[j][i] = array[i][j];
        }
    }

    // Выводим полученный массив
        System.out.println("Полученный массив:");
        for (int[] row : transposedArray) {
        System.out.println(Arrays.toString(row));
    }
}
}