package lr11;

import java.util.ArrayList;
import java.util.List;

public class Example9 {
    public static List<String> filterAlphabetic(List<String> inputList) {
        List<String> filteredList = new ArrayList<>();

        // Проходим по каждой строке в списке
        for (String str : inputList) {
            // Проверяем, состоит ли строка только из букв
            if (isAlphabetic(str)) {
                // Если да, добавляем строку в новый список
                filteredList.add(str);
            }
        }

        return filteredList;
    }

    private static boolean isAlphabetic(String str) {
        // Проверяем, состоит ли строка только из букв
        return str.matches("[a-zA-Z]+");
    }

    public static void main(String[] args) {
        // Пример использования
        List<String> inputList = new ArrayList<>();
        inputList.add("Hello");
        inputList.add("World123");
        inputList.add("Java");
        inputList.add("123abc");
        inputList.add("alphabetic");

        List<String> filteredList = filterAlphabetic(inputList);

        System.out.println("Исходный список: " + inputList);
        System.out.println("Отфильтрованный список: " + filteredList);
    }
}
