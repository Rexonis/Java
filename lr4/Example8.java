package lr4;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст для шифрования:");
        String inputText = scanner.nextLine();

        System.out.println("Введите ключ:");
        int key = scanner.nextInt();

        String encryptedText = encryptText(inputText, key);
        System.out.println("Текст после преобразования: " + encryptedText);

        System.out.println("Выполнить обратное преобразование? (Да/Нет)");
        String response = scanner.next();

        if (response.equals("Да")) {
            String decryptedText = decryptText(encryptedText, key);
            System.out.println("Обратное преобразование: " + decryptedText);
        } else if (response.equals("Нет")) {
            System.out.println("До свидания!");
        } else {
            System.out.println("Введите корректный ответ");
        }
    }

    public static String encryptText(String text, int key) {
        StringBuilder result = new StringBuilder();

        for (char symbol : text.toCharArray()) {
            if (Character.isLetter(symbol)) {
                char shiftedSymbol = (char) (((symbol - 'a' + key) % 26) + 'a');
                result.append(shiftedSymbol);
            } else {
                result.append(symbol);
            }
        }

        return result.toString();
    }

    public static String decryptText(String text, int key) {
        return encryptText(text, 26 - key); // Обратное преобразование - смещение в другую сторону
    }
}
