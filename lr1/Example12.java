package lr1;

import java.util.Scanner;

public class Example12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year1;

        System.out.println("Введите возраст: ");
        int year = in.nextInt();

        year1 = 2023 - year;

        System.out.println("Ваш год рождения: " + year1);
    }
}
