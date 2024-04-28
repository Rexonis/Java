package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example10 {
    public static List<Integer> generateRandomNumbers(int size) {
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        // Генерируем случайные числа и добавляем их в список
        for (int i = 0; i < size; i++) {
            randomList.add(random.nextInt(100));
        }

        return randomList;
    }

    public static List<Integer> filterLessThan(List<Integer> inputList, int threshold) {
        List<Integer> filteredList = new ArrayList<>();

        // Проходим по каждому числу в списке
        for (int num : inputList) {
            // Проверяем, меньше ли число заданного порогового значения
            if (num < threshold) {
                // Если меньше, добавляем число в новый список
                filteredList.add(num);
            }
        }

        return filteredList;
    }

    public static void main(String[] args) {
        // Генерируем случайный список чисел
        int listSize = 10;
        List<Integer> inputList = generateRandomNumbers(listSize);

        int threshold = 50;

        List<Integer> filteredList = filterLessThan(inputList, threshold);

        System.out.println("Исходный список: " + inputList);
        System.out.println("Отфильтрованный список: " + filteredList);
    }
}
