package lr11;

import java.util.ArrayList;
import java.util.List;

public class Example7 {
    public static List<String> filterByLength(List<String> inputList, int minLength) {
        List<String> filteredList = new ArrayList<>();

        // Проходим по каждой строке в списке
        for (String str : inputList) {
            // Проверяем, длина ли строки больше заданного минимального значения
            if (str.length() > minLength) {
                // Если длина больше, добавляем строку в новый список
                filteredList.add(str);
            }
        }

        return filteredList;
    }

    public static void main(String[] args) {
        // Пример использования
        List<String> inputList = new ArrayList<>();
        inputList.add("apple");
        inputList.add("banana");
        inputList.add("cherry");
        inputList.add("date");
        inputList.add("elderberry");

        int minLength = 6;
        List<String> filteredList = filterByLength(inputList, minLength);

        System.out.println("Исходный список: " + inputList);
        System.out.println("Отфильтрованный список: " + filteredList);
    }
}