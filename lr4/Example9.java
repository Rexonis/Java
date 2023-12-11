package lr4;

import java.util.Scanner;

public class Example9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String inputText = scanner.nextLine();

        System.out.println("Введите ключ:");
        int key = scanner.nextInt();

        String alphabet = "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ .,!?1234567890"; //Собственный алфавит

        String encryptedText = encryptText(inputText, key, alphabet);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (Да/Нет)");
        String response = scanner.next();

        if (response.equals("Да")) {
            String decryptedText = decryptText(encryptedText, key, alphabet);
            System.out.println("Обратное преобразование: " + decryptedText);
        } else if (response.equals("Нет")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }
    }

    public static String encryptText(String text, int key, String alphabet) {
        StringBuilder result = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            int index = alphabet.indexOf(symbol);
            if (index != -1) {
                char shiftedSymbol = alphabet.charAt((index + key) % alphabet.length());
                result.append(shiftedSymbol);
            } else {
                result.append(symbol);
            }
        }
        return result.toString();
    }

    public static String decryptText(String text, int key, String alphabet) {
        StringBuilder result = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            int index = alphabet.indexOf(symbol);
            if (index != -1) {
                char shiftedSymbol = alphabet.charAt((index - key + alphabet.length()) % alphabet.length());
                result.append(shiftedSymbol);
            } else {
                result.append(symbol);
            }
        }
        return result.toString();
    }
}

