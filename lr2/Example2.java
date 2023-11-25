package lr2;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int perem = in.nextInt();

        if (perem % 5 == 2 && (perem & 7) == 1) {
            System.out.println("Число делится ");
        }

        else {
            System.out.println("Число не делится");
        }
    }
}
