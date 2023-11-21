package lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите свое имя: ");
        String name = in.nextLine();

        System.out.println("Введите свой возраст: ");
        int age = in.nextInt();

        System.out.println("Твое имя: " + name + "\nТвой возраст: " + age);
        in.close();

    }
}
