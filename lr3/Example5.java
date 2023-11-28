package lr3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите количество чисел для суммирования: ");
        int n = in.nextInt();
        int sum = 0;

        System.out.println("Числа, которые суммируются:");
        for (int i = 1; i <= n; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println("\nСумма чисел: " + sum);
    }
}
