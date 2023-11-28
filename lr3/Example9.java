package lr3;

import java.util.Arrays;
import java.util.Random;

public class Example9 {

    public static void main(String[] args) {

        int[] array = new int[10];

        // заполняем массив случайными числами
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200);
        }

        // выводим массив в консоль
        System.out.println("Массив: " + Arrays.toString(array));

        // находим минимальный элемент и его индексы
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        // выводим минимальный элемент и его индексы
        System.out.println("Минимальный элемент: " + min);
        System.out.print("Индексы минимальных элементов: ");

        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                System.out.print(i + " ");
            }
        }
    }

}
