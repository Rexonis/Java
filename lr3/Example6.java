package lr3;

import java.util.Scanner;
import java.util.Arrays;


public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите размер массива: ");

        int arraysize = in.nextInt();

        if (arraysize <= 0) {

            System.out.println("Некорректный размер массива ");
            return;
        }

        int[] array = new int[arraysize];

        for (int i = 0; i < array.length; i++) {

            array[i] = i * 5 + 2;
        }

        System.out.println("Массив: " + Arrays.toString(array));
    }
}
