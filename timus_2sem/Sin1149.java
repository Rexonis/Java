package timus_2sem;

import java.io.*;
import java.util.Scanner;

public class Sin1149 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n, i, j;
        n = scanner.nextInt();
        for (i = 1; i < n; i++) {
            System.out.print("(");
        }
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                if (j > 1) {
                    System.out.print((j & 1) == 1? "+" : "-");
                }
                System.out.print("sin(" + j + ")");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(")");
            }
            System.out.print("+");
            System.out.print(n + 1 - i);
            if (i!= n) {
                System.out.print(")");
            }
        }
    }
}
