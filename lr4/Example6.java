package lr4;

import java.util.Arrays;
import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        int rows = 5;
        int cols = 5;
        int[][] originalArray = new int[rows][cols];

        //Инициализация и заполнение массива
        Random random = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                originalArray[i][j] = random.nextInt(10);
            }
        }

        //Вывод исходного массива
        System.out.println("Исходный массив:");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(originalArray[i]));
        }

        //Генерация случайных индексов строки и столбца для удаления
        int rowIndexToRemove = random.nextInt(rows);
        int colIndexToRemove = random.nextInt(cols);

        //Создание нового массива с удаленной строкой и столбцом
        int[][] newArray = new int[rows - 1][cols - 1];
        for (int i = 0, k = 0; i < rows; i++) {
            if (i == rowIndexToRemove) {
                continue; //Пропускаем удаленную строку
            }
            for (int j = 0, l = 0; j < cols; j++) {
                if (j == colIndexToRemove) {
                    continue; //Пропускаем удаленный столбец
                }
                newArray[k][l] = originalArray[i][j];
                l++;
            }
            k++;
        }

        //Вывод нового массива
        System.out.println("Новый массив:");

        for (int i = 0; i < newArray.length; i++) {
            System.out.println(Arrays.toString(newArray[i]));
        }
    }
}
