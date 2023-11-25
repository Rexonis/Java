package timus;

import java.util.Scanner;

public class Berries2001 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int math1, math2;

        // Ввод данных
        System.out.println("Введите массу ягод в корзине первого математика:");
        int a1 = in.nextInt();
        int b1 = in.nextInt();
        System.out.println("Введите массу ягод в корзине второго математика:");
        int a2 = in.nextInt();
        int b2 = in.nextInt();
        System.out.println("Введите массу ягод в корзине после пересыпания:");
        int a3 = in.nextInt();
        int b3 = in.nextInt();

        // Вычисление массы ягод в каждой корзине
        math1 = b1 - b2;
        math2 = b3 - math1 - b2;

        System.out.println(math2 + " " + math1);

    }
}
