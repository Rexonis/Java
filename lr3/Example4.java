package lr3;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите 2 целых числа: ");
        int a = in.nextInt();
        int b = in.nextInt();
        if (a > b) {
            a += (b - (b = a));
        }
        for (int i = a; i <= b; i++) {
            System.out.println(i);
        }
    }
}


