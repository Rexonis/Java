package timus;

import java.util.Scanner;

public class Budni1264 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int number = m + 1;

        int result = n * number;

        System.out.println(result);
    }
}
