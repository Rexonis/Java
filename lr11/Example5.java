package lr11;

import java.util.ArrayList;
import java.util.List;

public class Example5 {
    public static List<String> filterStrings(List<String> inputList, String substring) {
        List<String> filteredList = new ArrayList<>();

        // Проходим по каждой строке в списке
        for (String str : inputList) {
            // Проверяем, содержит ли строка заданную подстроку
            if (str.contains(substring)) {
                // Если содержит, добавляем ее в новый список
                filteredList.add(str);
            }
        }

        return filteredList;
    }

    public static void main(String[] args) {
        // Пример использования
        List<String> inputList = new ArrayList<>();
        inputList.add("Привет, мир!");
        inputList.add("Это тестовая строка");
        inputList.add("Здесь есть слово 'тест'");
        inputList.add("Еще одна строка без подстроки");

        String substring = "тест";
        List<String> filteredList = filterStrings(inputList, substring);

        System.out.println("Исходный список: " + inputList);
        System.out.println("Отфильтрованный список: " + filteredList);
    }
}
