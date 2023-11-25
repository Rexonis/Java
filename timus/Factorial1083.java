package timus;

import java.util.Scanner;

public class Factorial1083 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + num + " равен: " + factorial);
    }
}
