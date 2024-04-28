package lr11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Example8 {
    public static List<Integer> generateRandomList(int size, int maxValue) {
        List<Integer> randomList = new ArrayList<>();
        Random random = new Random();

        // Генерируем случайные числа и добавляем их в список
        for (int i = 0; i < size; i++) {
            int randomNumber = random.nextInt(maxValue);
            randomList.add(randomNumber);
        }

        return randomList;
    }

    public static List<Integer> filterGreaterThan(List<Integer> inputList, int threshold) {
        List<Integer> filteredList = new ArrayList<>();

        // Проходим по каждому числу в списке
        for (int num : inputList) {
            // Проверяем, больше ли число заданного порогового значения
            if (num > threshold) {
                // Если больше, добавляем число в новый список
                filteredList.add(num);
            }
        }

        return filteredList;
    }

    public static void main(String[] args) {
        // Пример использования
        int listSize = 10;
        int maxValue = 20;
        int threshold = 8;

        List<Integer> inputList = generateRandomList(listSize, maxValue);
        List<Integer> filteredList = filterGreaterThan(inputList, threshold);

        System.out.println("Исходный список: " + inputList);
        System.out.println("Отфильтрованный список: " + filteredList);
    }
}
