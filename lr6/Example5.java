package lr6;

import java.util.Scanner;

public class Example5 {

    private static long calc(int n) {
        long ret = 0;
        for (int i = 1; i <= n; i++) {
            ret += (long)Math.pow(i, 2);
        }
        return ret;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n: ");

        int n = in.nextInt();
        long res = calc(n);

        System.out.printf(String.format("Результат суммы квадратов: %d", res));
    }
}

