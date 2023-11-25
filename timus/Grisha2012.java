package timus;

import java.util.Scanner;

public class Grisha2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Ввод данных
        System.out.println("Введите количество задач, которые Гриша хочет решить за первый час:");
        int f = in.nextInt();

        // Проверка, может ли Гриша решить все задачи за 5 часов
        if (f + 5 >= 12) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
