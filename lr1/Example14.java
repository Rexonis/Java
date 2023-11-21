package lr1;

import java.util.Scanner;


public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int b, m, k;

        System.out.println("Введите число: ");
        int a = in.nextInt();
        //System.out.println("Полученное число: " + a);

        m = a - 1;
        //System.out.println("Полученное число меньше на единицу: " + m);

        b = a + 1;
        //System.out.println("Полученное число больше на единицу: " + b);

        k = (a + m + b) * (a + m + b);
        System.out.println("Последовательность чисел: " + a + ", " + m + ", " + b + ", " + k);

    }
}
