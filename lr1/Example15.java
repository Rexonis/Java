package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s, r;

        System.out.println("Введите 1 число: ");
        int a = in.nextInt();

        System.out.println("Введите 2 число: ");
        int b = in.nextInt();

        s = a + b;
        System.out.println("Сумма чисел: " + s);

        r = a - b;
        System.out.println("Разность чисел: " + r);

    }
}
