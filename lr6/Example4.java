package lr6;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {

        System.out.print("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.printf("Двойной факториал от %d равен %d%n", n, doubleFactorial(n));
    }

    public static int doubleFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else if (n % 2 == 0) {
            return n * doubleFactorial(n - 2);
        } else {
            return n * doubleFactorial(n - 1);
        }
    }
}

