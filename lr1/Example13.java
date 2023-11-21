package lr1;

import java.util.Scanner;

public class Example13 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum;

        System.out.println("Введите 1 число: ");
        int a = in.nextInt();

        System.out.println("Введите 2 число: ");
        int b = in.nextInt();

        sum = a + b;

        System.out.println("Сумма чисел равна: " + sum);
    }
}
