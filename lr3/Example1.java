package lr3;

import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

            System.out.println("Введите число от 1 до 7: ");
            int chislo = in.nextInt();

            if (chislo >= 1 && chislo <= 7 ) {
                switch (chislo) {

                    case 1:
                        System.out.println("Понедельник");
                        break;

                    case 2:
                        System.out.println("Вторник");
                        break;

                    case 3:
                        System.out.println("Среда");
                        break;

                    case 4:
                        System.out.println("Четверг");
                        break;

                    case 5:
                        System.out.println("Пятница");
                        break;

                    case 6:
                        System.out.println("Суббота");
                        break;

                    case 7:
                        System.out.println("Воскресенье");
                        break;

                }
            }
            else {
                System.out.println("Введите корректное число");
            }
    }
}
