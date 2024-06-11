package timus_2sem;

import java.io.*;
import java.util.Scanner;

public class Sport1313 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                a[i][j] = scanner.nextInt();
            }
        }
        for (int c = 0; c < 2 * n; ++c) {
            for (int i = n - 1; i >= 0; --i) {
                int j = c - i;
                if (0 <= j && j < n) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
    }
}
