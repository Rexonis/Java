package timus;

import java.util.Scanner;
import java.io.PrintWriter;

public class Bandit1409 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();

        int number = a + b - 1;

        int harry = number - a;
        int larry = number - b;

        out.println(harry + " " + larry);
        out.flush();
    }
}
