package lr3;

import java.util.Random;
import java.util.Arrays;

public class Example10 {

    public static void main(String[] args) {

        int[] array = new int[10];

        // заполняем массив случайными числами
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        // выводим неотсортированный массив
        System.out.println("Исходный массив: " + Arrays.toString(array));

        // сортируем массив в порядке убывания
        Arrays.sort(array);

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        // выводим отсортированный массив
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

}
