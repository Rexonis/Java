package lr1;

import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year1;

        System.out.println("Введите свой год рождения: ");
        int year = in.nextInt();

        year1 = 2023 - year;

        System.out.println("Вам: " + year1 + " лет");
    }
}
