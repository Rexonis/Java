package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = in.nextInt();

        // Получаем четвертую цифру справа
        int fourthDigit = (num / 1000) % 10;

        System.out.println("В числе " + num + " четвертая цифра справа: " + fourthDigit);
    }
}
