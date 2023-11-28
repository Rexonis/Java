package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число последовательности: ");
        int a = in.nextInt();

        int first = 1;
        int second = 1;
        int next;

        System.out.println("Последовательность чисел Фибоначчи: ");
        System.out.print(first + " " + second + " ");

        for (int i = 3; i <= a; i++) {
            next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;

        }

    }
}
